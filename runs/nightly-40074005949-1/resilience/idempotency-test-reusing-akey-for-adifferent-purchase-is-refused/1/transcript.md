# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-15776a76-f1e7-4c9b-a7eb-50d9440d0b70` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-550996d8-daea-49db-b293-60fcd1c010de` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-4bf9251f-b0b0-4467-bd1e-b7e3a2dc6916` |
| 4 | `POST /v1/credits/purchases` | 409 | 8 | `qa-d47ee106-aa90-4a78-837a-4d674c1dc275` |
| 5 | `GET /v1/credits/balance` | 200 | 11 | `qa-e10bf071-01b8-4dde-9f16-a8ab33ffe89f` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7b420459-edff-41f4-bad4-a258b854f090` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-740ded6b-7074-439b-9f22-fb938270d66b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15776a76-f1e7-4c9b-a7eb-50d9440d0b70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15776a76-f1e7-4c9b-a7eb-50d9440d0b70
Content-Type: application/json

--- request body ---
{"handle":"qa-68f58e74f1c8","displayName":"QA 68f58e74f1c8","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-15776a76-f1e7-4c9b-a7eb-50d9440d0b70
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
Location: /v1/accounts/qa-68f58e74f1c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c493a480-233a-4839-9107-8dd8b25858be","handle":"qa-68f58e74f1c8","displayName":"QA 68f58e74f1c8","region":"eu","role":"user","createdAt":"2026-10-24T07:25:06.619192859Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-550996d8-daea-49db-b293-60fcd1c010de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550996d8-daea-49db-b293-60fcd1c010de
Content-Type: application/json

--- request body ---
{"handle":"qa-68f58e74f1c8","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-550996d8-daea-49db-b293-60fcd1c010de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c493a480-233a-4839-9107-8dd8b25858be"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4bf9251f-b0b0-4467-bd1e-b7e3a2dc6916

--- request headers ---
Accept: application/json
Idempotency-Key: qa-753aa94677c8494d96cea6c65b188b1a
X-Correlation-Id: qa-4bf9251f-b0b0-4467-bd1e-b7e3a2dc6916
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bf9251f-b0b0-4467-bd1e-b7e3a2dc6916
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
Location: /v1/credits/purchases/pur_a49e5baf-a01c-41d4-a070-8c33b134554e
Content-Length: 144

{"id":"pur_a49e5baf-a01c-41d4-a070-8c33b134554e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.647147818Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d47ee106-aa90-4a78-837a-4d674c1dc275

--- request headers ---
Accept: application/json
Idempotency-Key: qa-753aa94677c8494d96cea6c65b188b1a
X-Correlation-Id: qa-d47ee106-aa90-4a78-837a-4d674c1dc275
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d47ee106-aa90-4a78-837a-4d674c1dc275
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-d47ee106-aa90-4a78-837a-4d674c1dc275"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-e10bf071-01b8-4dde-9f16-a8ab33ffe89f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e10bf071-01b8-4dde-9f16-a8ab33ffe89f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e10bf071-01b8-4dde-9f16-a8ab33ffe89f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_c493a480-233a-4839-9107-8dd8b25858be"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b420459-edff-41f4-bad4-a258b854f090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b420459-edff-41f4-bad4-a258b854f090
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b420459-edff-41f4-bad4-a258b854f090
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-740ded6b-7074-439b-9f22-fb938270d66b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-740ded6b-7074-439b-9f22-fb938270d66b
Content-Type: application/json

--- request body ---
{"handle":"qa-68f58e74f1c8","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-740ded6b-7074-439b-9f22-fb938270d66b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-740ded6b-7074-439b-9f22-fb938270d66b"}
```
