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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-bb065a7b-121b-4b03-942b-8bf56bb68f76` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-e9747280-10af-4bb5-a58b-4c3a101d5659` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-633c7a4c-8b92-4b58-acc6-bcfb18909703` |
| 4 | `POST /v1/credits/purchases` | 201 | 6 | `qa-11717fc7-ea3b-45a1-83f3-b5e1fce7e97d` |
| 5 | `POST /v1/auth/token` | 200 | 7 | `qa-6b40ad20-ea78-4991-9b11-357faa09aeaa` |
| 6 | `POST /v1/credits/purchases` | 201 | 7 | `qa-d03d6144-6d1d-480a-8ab9-4f75aca43ba3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b3571c2c-1fdf-4b07-9f56-89d974752c0f` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-ff047d16-0cb0-4aae-b76c-e1e08d322b18` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-b6b89313-20f5-4344-931f-839ac9220c81` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-afac95e1-276c-46f3-bf83-0308afbd6255` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb065a7b-121b-4b03-942b-8bf56bb68f76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb065a7b-121b-4b03-942b-8bf56bb68f76
Content-Type: application/json

--- request body ---
{"handle":"qa-9c193483f0bf","displayName":"QA 9c193483f0bf","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb065a7b-121b-4b03-942b-8bf56bb68f76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-9c193483f0bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e721ef23-c526-426e-a18f-abbd1dd2073f","handle":"qa-9c193483f0bf","displayName":"QA 9c193483f0bf","region":"eu","role":"user","createdAt":"2026-11-05T09:37:44.126444789Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e9747280-10af-4bb5-a58b-4c3a101d5659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9747280-10af-4bb5-a58b-4c3a101d5659
Content-Type: application/json

--- request body ---
{"handle":"qa-3060fe8fe03c","displayName":"QA 3060fe8fe03c","password":"****","region":"us"}

--- response: 201 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9747280-10af-4bb5-a58b-4c3a101d5659
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-3060fe8fe03c
X-Served-Region: us
Content-Length: 181

{"id":"acc_4c541539-d4ff-46a6-90a9-3a987bdffce1","handle":"qa-3060fe8fe03c","displayName":"QA 3060fe8fe03c","region":"us","role":"user","createdAt":"2026-11-05T09:37:44.139392426Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-633c7a4c-8b92-4b58-acc6-bcfb18909703

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-633c7a4c-8b92-4b58-acc6-bcfb18909703
Content-Type: application/json

--- request body ---
{"handle":"qa-9c193483f0bf","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-633c7a4c-8b92-4b58-acc6-bcfb18909703
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e721ef23-c526-426e-a18f-abbd1dd2073f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-11717fc7-ea3b-45a1-83f3-b5e1fce7e97d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2d558233b473415797b2627dfd25b067
X-Correlation-Id: qa-11717fc7-ea3b-45a1-83f3-b5e1fce7e97d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-11717fc7-ea3b-45a1-83f3-b5e1fce7e97d
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
Location: /v1/credits/purchases/pur_dd90e61d-412a-455a-8e54-a8090a4d57d4
Content-Length: 144

{"id":"pur_dd90e61d-412a-455a-8e54-a8090a4d57d4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:44.164376335Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6b40ad20-ea78-4991-9b11-357faa09aeaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b40ad20-ea78-4991-9b11-357faa09aeaa
Content-Type: application/json

--- request body ---
{"handle":"qa-3060fe8fe03c","password":"****"}

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b40ad20-ea78-4991-9b11-357faa09aeaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c541539-d4ff-46a6-90a9-3a987bdffce1"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d03d6144-6d1d-480a-8ab9-4f75aca43ba3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2d558233b473415797b2627dfd25b067
X-Correlation-Id: qa-d03d6144-6d1d-480a-8ab9-4f75aca43ba3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-d03d6144-6d1d-480a-8ab9-4f75aca43ba3
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
Location: /v1/credits/purchases/pur_05867922-945d-41a0-b902-9b08c1b3968f
Content-Length: 144

{"id":"pur_05867922-945d-41a0-b902-9b08c1b3968f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:44.190669700Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3571c2c-1fdf-4b07-9f56-89d974752c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3571c2c-1fdf-4b07-9f56-89d974752c0f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3571c2c-1fdf-4b07-9f56-89d974752c0f
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
correlation: qa-ff047d16-0cb0-4aae-b76c-e1e08d322b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff047d16-0cb0-4aae-b76c-e1e08d322b18
Content-Type: application/json

--- request body ---
{"handle":"qa-3060fe8fe03c","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff047d16-0cb0-4aae-b76c-e1e08d322b18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ff047d16-0cb0-4aae-b76c-e1e08d322b18"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6b89313-20f5-4344-931f-839ac9220c81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6b89313-20f5-4344-931f-839ac9220c81
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6b89313-20f5-4344-931f-839ac9220c81
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
correlation: qa-afac95e1-276c-46f3-bf83-0308afbd6255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afac95e1-276c-46f3-bf83-0308afbd6255
Content-Type: application/json

--- request body ---
{"handle":"qa-9c193483f0bf","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afac95e1-276c-46f3-bf83-0308afbd6255
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afac95e1-276c-46f3-bf83-0308afbd6255"}
```
