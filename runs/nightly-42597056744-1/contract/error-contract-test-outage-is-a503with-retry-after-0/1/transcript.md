# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-9db60200-dfeb-4b82-8ab1-97ce88122f5a` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-d0a375a7-39f0-4127-ba84-4cb956dbbb47` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d89a5911-35df-4b11-8321-320a62f8f1ee` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8c1c0434-acb6-4d1f-93cd-d72f9738efef` |
| 5 | `POST /v1/auth/token` | 503 | 3 | `qa-6a9d0b80-6e56-44f7-9d7f-094d73352a2d` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-7a758fa5-c940-4511-ba9e-89ae33280f8a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-46cddcb4-459b-409f-b2ec-1e608b5fd7e4` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-2c4ea9bf-82ad-4698-a560-cf6a5cdbefdf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 52 | `qa-00014190-f5f8-4211-b6b6-bf75a833ba20` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-de965fa2-fd63-4c2c-a16a-9e39733b65a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9db60200-dfeb-4b82-8ab1-97ce88122f5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9db60200-dfeb-4b82-8ab1-97ce88122f5a
Content-Type: application/json

--- request body ---
{"handle":"qa-694b6da7b00b","displayName":"QA 694b6da7b00b","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9db60200-dfeb-4b82-8ab1-97ce88122f5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-694b6da7b00b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e66bf7c0-da54-4473-9721-67b209b2e307","handle":"qa-694b6da7b00b","displayName":"QA 694b6da7b00b","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.881300889Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0a375a7-39f0-4127-ba84-4cb956dbbb47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a375a7-39f0-4127-ba84-4cb956dbbb47
Content-Type: application/json

--- request body ---
{"handle":"qa-616e76436551","displayName":"QA 616e76436551","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0a375a7-39f0-4127-ba84-4cb956dbbb47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-616e76436551
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50468120-2a17-4f87-92f7-aaabf22e46e0","handle":"qa-616e76436551","displayName":"QA 616e76436551","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.919501406Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d89a5911-35df-4b11-8321-320a62f8f1ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d89a5911-35df-4b11-8321-320a62f8f1ee
Content-Type: application/json

--- request body ---
{"handle":"qa-694b6da7b00b","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d89a5911-35df-4b11-8321-320a62f8f1ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e66bf7c0-da54-4473-9721-67b209b2e307"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8c1c0434-acb6-4d1f-93cd-d72f9738efef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c1c0434-acb6-4d1f-93cd-d72f9738efef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-616e76436551","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c1c0434-acb6-4d1f-93cd-d72f9738efef
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
Location: /v1/conversations/cnv_c945403a-2dee-47ad-8962-c2a28921656f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c945403a-2dee-47ad-8962-c2a28921656f","subject":"Error contract","status":"open","region":"eu","participants":["qa-694b6da7b00b","qa-616e76436551"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.980415743Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6a9d0b80-6e56-44f7-9d7f-094d73352a2d

--- request headers ---
Accept: application/json
X-Fault-Key: 7297654e-610b-4cc9-aced-1ca9d6280524
X-Fault: unavailable-once
X-Correlation-Id: qa-6a9d0b80-6e56-44f7-9d7f-094d73352a2d
Content-Type: application/json

--- request body ---
{"handle":"qa-694b6da7b00b","password":"****"}

--- response: 503 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a9d0b80-6e56-44f7-9d7f-094d73352a2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-6a9d0b80-6e56-44f7-9d7f-094d73352a2d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7a758fa5-c940-4511-ba9e-89ae33280f8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a758fa5-c940-4511-ba9e-89ae33280f8a
Content-Type: application/json

--- request body ---
{"handle":"qa-616e76436551","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a758fa5-c940-4511-ba9e-89ae33280f8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50468120-2a17-4f87-92f7-aaabf22e46e0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46cddcb4-459b-409f-b2ec-1e608b5fd7e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46cddcb4-459b-409f-b2ec-1e608b5fd7e4
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46cddcb4-459b-409f-b2ec-1e608b5fd7e4
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-2c4ea9bf-82ad-4698-a560-cf6a5cdbefdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c4ea9bf-82ad-4698-a560-cf6a5cdbefdf
Content-Type: application/json

--- request body ---
{"handle":"qa-616e76436551","password":"****"}

--- response: 401 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c4ea9bf-82ad-4698-a560-cf6a5cdbefdf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c4ea9bf-82ad-4698-a560-cf6a5cdbefdf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00014190-f5f8-4211-b6b6-bf75a833ba20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00014190-f5f8-4211-b6b6-bf75a833ba20
Content-Type: application/json

--- response: 204 in 52 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00014190-f5f8-4211-b6b6-bf75a833ba20
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
correlation: qa-de965fa2-fd63-4c2c-a16a-9e39733b65a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de965fa2-fd63-4c2c-a16a-9e39733b65a6
Content-Type: application/json

--- request body ---
{"handle":"qa-694b6da7b00b","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de965fa2-fd63-4c2c-a16a-9e39733b65a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de965fa2-fd63-4c2c-a16a-9e39733b65a6"}
```
