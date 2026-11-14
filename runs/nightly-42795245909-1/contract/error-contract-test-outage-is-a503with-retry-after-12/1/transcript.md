# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-127837e9-5724-4ac9-85d6-9d9d3caad5b0` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-23638153-9444-4dcf-92d4-404a812a61be` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-99946b88-5191-466e-b69b-f6afe0f35f18` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-5f08fc67-5b88-4dd4-8556-46761fb0150b` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 26 | `qa-85eb68da-ab82-4053-88aa-302197a20749` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-a8122525-7597-49f4-b205-5e4d3aeffafd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8ce9427b-3cb4-4208-8eb4-a75f11736f92` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-c0679c01-a04d-4659-81de-6764b2d3d865` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-c6e585bc-0a42-412e-a166-7addfe6e3abf` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-3aa3c25c-3af8-4291-9845-771dd504ac9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-127837e9-5724-4ac9-85d6-9d9d3caad5b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-127837e9-5724-4ac9-85d6-9d9d3caad5b0
Content-Type: application/json

--- request body ---
{"handle":"qa-79f6bb373e43","displayName":"QA 79f6bb373e43","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-127837e9-5724-4ac9-85d6-9d9d3caad5b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Location: /v1/accounts/qa-79f6bb373e43
X-Served-Region: eu
Content-Length: 181

{"id":"acc_52b3a3c8-5ceb-468c-ac8f-bb1ebf549387","handle":"qa-79f6bb373e43","displayName":"QA 79f6bb373e43","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.228484143Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-23638153-9444-4dcf-92d4-404a812a61be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23638153-9444-4dcf-92d4-404a812a61be
Content-Type: application/json

--- request body ---
{"handle":"qa-2b66a5d35c5b","displayName":"QA 2b66a5d35c5b","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-23638153-9444-4dcf-92d4-404a812a61be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Location: /v1/accounts/qa-2b66a5d35c5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fcbb588-65e6-4960-bdd0-309d2332e635","handle":"qa-2b66a5d35c5b","displayName":"QA 2b66a5d35c5b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.280081782Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-99946b88-5191-466e-b69b-f6afe0f35f18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99946b88-5191-466e-b69b-f6afe0f35f18
Content-Type: application/json

--- request body ---
{"handle":"qa-79f6bb373e43","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-99946b88-5191-466e-b69b-f6afe0f35f18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_52b3a3c8-5ceb-468c-ac8f-bb1ebf549387"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5f08fc67-5b88-4dd4-8556-46761fb0150b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f08fc67-5b88-4dd4-8556-46761fb0150b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2b66a5d35c5b","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f08fc67-5b88-4dd4-8556-46761fb0150b
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
Location: /v1/conversations/cnv_f3fb30fa-8808-41c0-b13c-823a77a93f29
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3fb30fa-8808-41c0-b13c-823a77a93f29","subject":"Error contract","status":"open","region":"eu","participants":["qa-79f6bb373e43","qa-2b66a5d35c5b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.353238424Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f3fb30fa-8808-41c0-b13c-823a77a93f29/close
correlation: qa-85eb68da-ab82-4053-88aa-302197a20749

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6b0aff03-93e8-4629-a5ed-6b22b2705fba
X-Correlation-Id: qa-85eb68da-ab82-4053-88aa-302197a20749
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85eb68da-ab82-4053-88aa-302197a20749
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_f3fb30fa-8808-41c0-b13c-823a77a93f29/close","correlationId":"qa-85eb68da-ab82-4053-88aa-302197a20749"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a8122525-7597-49f4-b205-5e4d3aeffafd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8122525-7597-49f4-b205-5e4d3aeffafd
Content-Type: application/json

--- request body ---
{"handle":"qa-2b66a5d35c5b","password":"****"}

--- response: 200 in 60 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8122525-7597-49f4-b205-5e4d3aeffafd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fcbb588-65e6-4960-bdd0-309d2332e635"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ce9427b-3cb4-4208-8eb4-a75f11736f92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ce9427b-3cb4-4208-8eb4-a75f11736f92
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ce9427b-3cb4-4208-8eb4-a75f11736f92
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
correlation: qa-c0679c01-a04d-4659-81de-6764b2d3d865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0679c01-a04d-4659-81de-6764b2d3d865
Content-Type: application/json

--- request body ---
{"handle":"qa-2b66a5d35c5b","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0679c01-a04d-4659-81de-6764b2d3d865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0679c01-a04d-4659-81de-6764b2d3d865"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6e585bc-0a42-412e-a166-7addfe6e3abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6e585bc-0a42-412e-a166-7addfe6e3abf
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6e585bc-0a42-412e-a166-7addfe6e3abf
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
correlation: qa-3aa3c25c-3af8-4291-9845-771dd504ac9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aa3c25c-3af8-4291-9845-771dd504ac9b
Content-Type: application/json

--- request body ---
{"handle":"qa-79f6bb373e43","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3aa3c25c-3af8-4291-9845-771dd504ac9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3aa3c25c-3af8-4291-9845-771dd504ac9b"}
```
