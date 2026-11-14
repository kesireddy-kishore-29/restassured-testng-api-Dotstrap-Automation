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
| 1 | `POST /v1/accounts` | 201 | 378 | `qa-4975e161-dea3-4569-b249-4ea26aada422` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-3e22359c-db19-405f-9799-ce0f86314e7e` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-fd3d48d4-ebe2-4242-a968-685ba6559aac` |
| 4 | `POST /v1/credits/purchases` | 201 | 65 | `qa-a86955d7-9504-4f28-b393-68544c74c83b` |
| 5 | `POST /v1/auth/token` | 200 | 27 | `qa-9f5bf0e5-38bc-4b6b-9d74-329956c3650c` |
| 6 | `POST /v1/credits/purchases` | 201 | 7 | `qa-e92a6cc0-b5e2-4013-ac6d-48716f2b65a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-7c7f9e56-4439-45f5-b255-5b6c93bce23b` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-93dcd9e1-b8bf-4466-a5ab-6a1dd5ab028d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1e8966d1-395c-4c50-a94f-6d231de57137` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-5f5567f1-b31e-46de-b742-9a82c98a7586` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4975e161-dea3-4569-b249-4ea26aada422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4975e161-dea3-4569-b249-4ea26aada422
Content-Type: application/json

--- request body ---
{"handle":"qa-3227d35d865f","displayName":"QA 3227d35d865f","password":"****","region":"eu"}

--- response: 201 in 378 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4975e161-dea3-4569-b249-4ea26aada422
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-3227d35d865f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2195d66a-48a6-4dd7-8a4e-17894cd1c01e","handle":"qa-3227d35d865f","displayName":"QA 3227d35d865f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.511510519Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3e22359c-db19-405f-9799-ce0f86314e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e22359c-db19-405f-9799-ce0f86314e7e
Content-Type: application/json

--- request body ---
{"handle":"qa-2e2bcde8480c","displayName":"QA 2e2bcde8480c","password":"****","region":"us"}

--- response: 201 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e22359c-db19-405f-9799-ce0f86314e7e
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
Location: /v1/accounts/qa-2e2bcde8480c
X-Served-Region: us
Content-Length: 181

{"id":"acc_89ecfe64-9840-4d88-b31c-e6ead57c323e","handle":"qa-2e2bcde8480c","displayName":"QA 2e2bcde8480c","region":"us","role":"user","createdAt":"2026-11-13T09:42:08.844035856Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd3d48d4-ebe2-4242-a968-685ba6559aac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd3d48d4-ebe2-4242-a968-685ba6559aac
Content-Type: application/json

--- request body ---
{"handle":"qa-3227d35d865f","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd3d48d4-ebe2-4242-a968-685ba6559aac
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2195d66a-48a6-4dd7-8a4e-17894cd1c01e"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a86955d7-9504-4f28-b393-68544c74c83b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-56306707e72646cd884e7ad938e27e99
X-Correlation-Id: qa-a86955d7-9504-4f28-b393-68544c74c83b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a86955d7-9504-4f28-b393-68544c74c83b
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
Location: /v1/credits/purchases/pur_a502ad83-225f-4930-ac0a-83cddb8dd6f2
Content-Length: 144

{"id":"pur_a502ad83-225f-4930-ac0a-83cddb8dd6f2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.011512303Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9f5bf0e5-38bc-4b6b-9d74-329956c3650c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5bf0e5-38bc-4b6b-9d74-329956c3650c
Content-Type: application/json

--- request body ---
{"handle":"qa-2e2bcde8480c","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f5bf0e5-38bc-4b6b-9d74-329956c3650c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89ecfe64-9840-4d88-b31c-e6ead57c323e"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e92a6cc0-b5e2-4013-ac6d-48716f2b65a2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-56306707e72646cd884e7ad938e27e99
X-Correlation-Id: qa-e92a6cc0-b5e2-4013-ac6d-48716f2b65a2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e92a6cc0-b5e2-4013-ac6d-48716f2b65a2
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
Location: /v1/credits/purchases/pur_15703f20-9fef-46b8-adcd-e0decffabdd8
Content-Length: 144

{"id":"pur_15703f20-9fef-46b8-adcd-e0decffabdd8","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.104114498Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c7f9e56-4439-45f5-b255-5b6c93bce23b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c7f9e56-4439-45f5-b255-5b6c93bce23b
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c7f9e56-4439-45f5-b255-5b6c93bce23b
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
correlation: qa-93dcd9e1-b8bf-4466-a5ab-6a1dd5ab028d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93dcd9e1-b8bf-4466-a5ab-6a1dd5ab028d
Content-Type: application/json

--- request body ---
{"handle":"qa-2e2bcde8480c","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93dcd9e1-b8bf-4466-a5ab-6a1dd5ab028d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93dcd9e1-b8bf-4466-a5ab-6a1dd5ab028d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e8966d1-395c-4c50-a94f-6d231de57137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e8966d1-395c-4c50-a94f-6d231de57137
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e8966d1-395c-4c50-a94f-6d231de57137
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
correlation: qa-5f5567f1-b31e-46de-b742-9a82c98a7586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5567f1-b31e-46de-b742-9a82c98a7586
Content-Type: application/json

--- request body ---
{"handle":"qa-3227d35d865f","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f5567f1-b31e-46de-b742-9a82c98a7586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f5567f1-b31e-46de-b742-9a82c98a7586"}
```
