# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-30ad26c2-e441-4fd6-a4aa-2d7715cac9e5` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-bdd72c2d-c830-4363-bcb7-2f40a13c0b40` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-743923c9-2e55-4419-8572-8d6005273f3b` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-85f9bad9-24fd-4460-9b1d-7fc563485c6e` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 22 | `qa-eb0cff5c-d222-48e8-b7ea-1e3c397d5fee` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-b45959d2-a431-4eb4-996d-eca02d09f52e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 54 | `qa-7e8a982c-0775-4f1c-b6fe-2dca2b2b8497` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-ae625e21-2b5d-4ffd-9608-35cda21c2689` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-78334a5d-fd37-4049-983d-4673da1e08ff` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-d87e3bc0-7b2a-40ae-8a1c-bb6129981f97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-30ad26c2-e441-4fd6-a4aa-2d7715cac9e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30ad26c2-e441-4fd6-a4aa-2d7715cac9e5
Content-Type: application/json

--- request body ---
{"handle":"qa-8e1640dbaba4","displayName":"QA 8e1640dbaba4","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-30ad26c2-e441-4fd6-a4aa-2d7715cac9e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Location: /v1/accounts/qa-8e1640dbaba4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f02bac2f-52f1-4be5-bee8-77ebe9deb6fe","handle":"qa-8e1640dbaba4","displayName":"QA 8e1640dbaba4","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.809539202Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bdd72c2d-c830-4363-bcb7-2f40a13c0b40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd72c2d-c830-4363-bcb7-2f40a13c0b40
Content-Type: application/json

--- request body ---
{"handle":"qa-c5af7a805f4e","displayName":"QA c5af7a805f4e","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdd72c2d-c830-4363-bcb7-2f40a13c0b40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Location: /v1/accounts/qa-c5af7a805f4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7f89c8e-bc48-44b8-895e-addbfa6fd6c4","handle":"qa-c5af7a805f4e","displayName":"QA c5af7a805f4e","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.893305364Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-743923c9-2e55-4419-8572-8d6005273f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743923c9-2e55-4419-8572-8d6005273f3b
Content-Type: application/json

--- request body ---
{"handle":"qa-8e1640dbaba4","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-743923c9-2e55-4419-8572-8d6005273f3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f02bac2f-52f1-4be5-bee8-77ebe9deb6fe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-85f9bad9-24fd-4460-9b1d-7fc563485c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85f9bad9-24fd-4460-9b1d-7fc563485c6e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5af7a805f4e","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-85f9bad9-24fd-4460-9b1d-7fc563485c6e
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
Location: /v1/conversations/cnv_c32c3a0b-af06-4eef-b613-d83ea62a39c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c32c3a0b-af06-4eef-b613-d83ea62a39c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e1640dbaba4","qa-c5af7a805f4e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.975133407Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-8e1640dbaba4
correlation: qa-eb0cff5c-d222-48e8-b7ea-1e3c397d5fee

--- request headers ---
Accept: application/json
X-Fault-Key: 9b2bd899-817d-467e-bd6d-18d9be1dc6cb
X-Fault: unavailable-once
X-Correlation-Id: qa-eb0cff5c-d222-48e8-b7ea-1e3c397d5fee
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb0cff5c-d222-48e8-b7ea-1e3c397d5fee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-8e1640dbaba4","correlationId":"qa-eb0cff5c-d222-48e8-b7ea-1e3c397d5fee"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b45959d2-a431-4eb4-996d-eca02d09f52e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b45959d2-a431-4eb4-996d-eca02d09f52e
Content-Type: application/json

--- request body ---
{"handle":"qa-c5af7a805f4e","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b45959d2-a431-4eb4-996d-eca02d09f52e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7f89c8e-bc48-44b8-895e-addbfa6fd6c4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e8a982c-0775-4f1c-b6fe-2dca2b2b8497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e8a982c-0775-4f1c-b6fe-2dca2b2b8497
Content-Type: application/json

--- response: 204 in 54 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e8a982c-0775-4f1c-b6fe-2dca2b2b8497
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
correlation: qa-ae625e21-2b5d-4ffd-9608-35cda21c2689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae625e21-2b5d-4ffd-9608-35cda21c2689
Content-Type: application/json

--- request body ---
{"handle":"qa-c5af7a805f4e","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae625e21-2b5d-4ffd-9608-35cda21c2689
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae625e21-2b5d-4ffd-9608-35cda21c2689"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78334a5d-fd37-4049-983d-4673da1e08ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78334a5d-fd37-4049-983d-4673da1e08ff
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78334a5d-fd37-4049-983d-4673da1e08ff
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
correlation: qa-d87e3bc0-7b2a-40ae-8a1c-bb6129981f97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d87e3bc0-7b2a-40ae-8a1c-bb6129981f97
Content-Type: application/json

--- request body ---
{"handle":"qa-8e1640dbaba4","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d87e3bc0-7b2a-40ae-8a1c-bb6129981f97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d87e3bc0-7b2a-40ae-8a1c-bb6129981f97"}
```
