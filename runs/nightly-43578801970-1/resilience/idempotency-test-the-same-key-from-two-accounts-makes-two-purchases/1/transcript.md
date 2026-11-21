# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 490 | `qa-98be84cd-cfe3-4cad-ab49-f9f2c0125df1` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-887dfed0-1325-4bc4-909d-9d765bac79af` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-048bb3f3-8872-4d59-a367-4cf7f0cdb6fc` |
| 4 | `POST /v1/credits/purchases` | 201 | 72 | `qa-a073892d-9e02-400a-b0ef-5dc4bc875c63` |
| 5 | `POST /v1/auth/token` | 200 | 30 | `qa-49362f51-3bec-4bab-bc39-36a20201e98d` |
| 6 | `POST /v1/credits/purchases` | 201 | 17 | `qa-9836e72f-b654-4d7c-b392-41cb1cdbc0d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 52 | `qa-69f13894-1fbb-4884-998b-e6ef461e5e01` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-133ecf71-4611-424c-ba58-6b5abb47dc9b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-2db33030-1a17-4ee4-8d24-701e029b0bb4` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-5839b0bb-c2a4-4f04-8ffa-bf04f993693d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-98be84cd-cfe3-4cad-ab49-f9f2c0125df1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98be84cd-cfe3-4cad-ab49-f9f2c0125df1
Content-Type: application/json

--- request body ---
{"handle":"qa-f5b88a49135e","displayName":"QA f5b88a49135e","password":"****","region":"eu"}

--- response: 201 in 490 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-98be84cd-cfe3-4cad-ab49-f9f2c0125df1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-f5b88a49135e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6796f816-e3fe-45f9-bf98-8f89bac874d0","handle":"qa-f5b88a49135e","displayName":"QA f5b88a49135e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.223375757Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-887dfed0-1325-4bc4-909d-9d765bac79af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-887dfed0-1325-4bc4-909d-9d765bac79af
Content-Type: application/json

--- request body ---
{"handle":"qa-45dbb0dcbe3e","displayName":"QA 45dbb0dcbe3e","password":"****","region":"us"}

--- response: 201 in 45 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-887dfed0-1325-4bc4-909d-9d765bac79af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-45dbb0dcbe3e
X-Served-Region: us
Content-Length: 181

{"id":"acc_2a6b8c30-c570-482b-8475-5f1a81be56bc","handle":"qa-45dbb0dcbe3e","displayName":"QA 45dbb0dcbe3e","region":"us","role":"user","createdAt":"2026-11-14T09:05:14.648586157Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-048bb3f3-8872-4d59-a367-4cf7f0cdb6fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-048bb3f3-8872-4d59-a367-4cf7f0cdb6fc
Content-Type: application/json

--- request body ---
{"handle":"qa-f5b88a49135e","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-048bb3f3-8872-4d59-a367-4cf7f0cdb6fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6796f816-e3fe-45f9-bf98-8f89bac874d0"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a073892d-9e02-400a-b0ef-5dc4bc875c63

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5a484ebea75e4a2588d28e3c4e3f6135
X-Correlation-Id: qa-a073892d-9e02-400a-b0ef-5dc4bc875c63
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a073892d-9e02-400a-b0ef-5dc4bc875c63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_0757f44c-e9eb-4389-8aa4-abbd9d8e311f
Content-Length: 144

{"id":"pur_0757f44c-e9eb-4389-8aa4-abbd9d8e311f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.824006107Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-49362f51-3bec-4bab-bc39-36a20201e98d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49362f51-3bec-4bab-bc39-36a20201e98d
Content-Type: application/json

--- request body ---
{"handle":"qa-45dbb0dcbe3e","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-49362f51-3bec-4bab-bc39-36a20201e98d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a6b8c30-c570-482b-8475-5f1a81be56bc"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9836e72f-b654-4d7c-b392-41cb1cdbc0d1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5a484ebea75e4a2588d28e3c4e3f6135
X-Correlation-Id: qa-9836e72f-b654-4d7c-b392-41cb1cdbc0d1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9836e72f-b654-4d7c-b392-41cb1cdbc0d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_01135b41-5406-4f7c-a509-5e9759718742
Content-Length: 144

{"id":"pur_01135b41-5406-4f7c-a509-5e9759718742","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.931535223Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69f13894-1fbb-4884-998b-e6ef461e5e01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69f13894-1fbb-4884-998b-e6ef461e5e01
Content-Type: application/json

--- response: 204 in 52 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69f13894-1fbb-4884-998b-e6ef461e5e01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-133ecf71-4611-424c-ba58-6b5abb47dc9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-133ecf71-4611-424c-ba58-6b5abb47dc9b
Content-Type: application/json

--- request body ---
{"handle":"qa-45dbb0dcbe3e","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-133ecf71-4611-424c-ba58-6b5abb47dc9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-133ecf71-4611-424c-ba58-6b5abb47dc9b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2db33030-1a17-4ee4-8d24-701e029b0bb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db33030-1a17-4ee4-8d24-701e029b0bb4
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2db33030-1a17-4ee4-8d24-701e029b0bb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5839b0bb-c2a4-4f04-8ffa-bf04f993693d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5839b0bb-c2a4-4f04-8ffa-bf04f993693d
Content-Type: application/json

--- request body ---
{"handle":"qa-f5b88a49135e","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5839b0bb-c2a4-4f04-8ffa-bf04f993693d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5839b0bb-c2a4-4f04-8ffa-bf04f993693d"}
```
