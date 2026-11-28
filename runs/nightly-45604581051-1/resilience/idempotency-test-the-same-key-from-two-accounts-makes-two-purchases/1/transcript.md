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
| 1 | `POST /v1/accounts` | 201 | 430 | `qa-bb58086f-e0a9-43b0-8952-9395d1d295b5` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-e1586fee-88a9-486f-9fb7-400861125383` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-45ae9d53-ab4c-4ce5-810a-a39208310e97` |
| 4 | `POST /v1/credits/purchases` | 201 | 47 | `qa-71ebb0e2-8203-4f6b-b784-db89c6306cc7` |
| 5 | `POST /v1/auth/token` | 200 | 38 | `qa-75a5cda7-ac07-43a2-9325-5e733bce0e18` |
| 6 | `POST /v1/credits/purchases` | 201 | 14 | `qa-7af1536c-ee38-445d-81cb-4b25093c6878` |
| 7 | `DELETE /v1/accounts/me` | 204 | 52 | `qa-b45d7ecb-2047-4a29-9aa0-fa688d79314a` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-b5c18789-0e0b-4db0-92f3-affb48db9e0b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-37939b96-a893-4020-984e-dc447d625396` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-03dc57a8-4f72-4f30-a759-b6041204b0f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb58086f-e0a9-43b0-8952-9395d1d295b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb58086f-e0a9-43b0-8952-9395d1d295b5
Content-Type: application/json

--- request body ---
{"handle":"qa-235ec8cace84","displayName":"QA 235ec8cace84","password":"****","region":"eu"}

--- response: 201 in 430 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb58086f-e0a9-43b0-8952-9395d1d295b5
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
Location: /v1/accounts/qa-235ec8cace84
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b91da30c-a992-4575-821c-993ee0375530","handle":"qa-235ec8cace84","displayName":"QA 235ec8cace84","region":"eu","role":"user","createdAt":"2026-11-25T11:27:49.228417133Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1586fee-88a9-486f-9fb7-400861125383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1586fee-88a9-486f-9fb7-400861125383
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc998cfc3af","displayName":"QA 6dc998cfc3af","password":"****","region":"us"}

--- response: 201 in 60 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1586fee-88a9-486f-9fb7-400861125383
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
Location: /v1/accounts/qa-6dc998cfc3af
X-Served-Region: us
Content-Length: 181

{"id":"acc_e1676c07-43c3-4347-8480-bf6a8344540b","handle":"qa-6dc998cfc3af","displayName":"QA 6dc998cfc3af","region":"us","role":"user","createdAt":"2026-11-25T11:27:49.668086885Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-45ae9d53-ab4c-4ce5-810a-a39208310e97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45ae9d53-ab4c-4ce5-810a-a39208310e97
Content-Type: application/json

--- request body ---
{"handle":"qa-235ec8cace84","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-45ae9d53-ab4c-4ce5-810a-a39208310e97
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b91da30c-a992-4575-821c-993ee0375530"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-71ebb0e2-8203-4f6b-b784-db89c6306cc7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bc8a5e788bd44e5b9fca3ff94750ccd2
X-Correlation-Id: qa-71ebb0e2-8203-4f6b-b784-db89c6306cc7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 47 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-71ebb0e2-8203-4f6b-b784-db89c6306cc7
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
Location: /v1/credits/purchases/pur_d081b41e-a5c1-4ffe-8d5d-3e8fb9a08e23
Content-Length: 144

{"id":"pur_d081b41e-a5c1-4ffe-8d5d-3e8fb9a08e23","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.828896199Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-75a5cda7-ac07-43a2-9325-5e733bce0e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a5cda7-ac07-43a2-9325-5e733bce0e18
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc998cfc3af","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-75a5cda7-ac07-43a2-9325-5e733bce0e18
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1676c07-43c3-4347-8480-bf6a8344540b"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7af1536c-ee38-445d-81cb-4b25093c6878

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bc8a5e788bd44e5b9fca3ff94750ccd2
X-Correlation-Id: qa-7af1536c-ee38-445d-81cb-4b25093c6878
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7af1536c-ee38-445d-81cb-4b25093c6878
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
Location: /v1/credits/purchases/pur_19775aef-2e31-4bd3-808f-797fc566e146
Content-Length: 144

{"id":"pur_19775aef-2e31-4bd3-808f-797fc566e146","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.962710712Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b45d7ecb-2047-4a29-9aa0-fa688d79314a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b45d7ecb-2047-4a29-9aa0-fa688d79314a
Content-Type: application/json

--- response: 204 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b45d7ecb-2047-4a29-9aa0-fa688d79314a
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
correlation: qa-b5c18789-0e0b-4db0-92f3-affb48db9e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5c18789-0e0b-4db0-92f3-affb48db9e0b
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc998cfc3af","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5c18789-0e0b-4db0-92f3-affb48db9e0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5c18789-0e0b-4db0-92f3-affb48db9e0b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37939b96-a893-4020-984e-dc447d625396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37939b96-a893-4020-984e-dc447d625396
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37939b96-a893-4020-984e-dc447d625396
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
correlation: qa-03dc57a8-4f72-4f30-a759-b6041204b0f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03dc57a8-4f72-4f30-a759-b6041204b0f3
Content-Type: application/json

--- request body ---
{"handle":"qa-235ec8cace84","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03dc57a8-4f72-4f30-a759-b6041204b0f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03dc57a8-4f72-4f30-a759-b6041204b0f3"}
```
