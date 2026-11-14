# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-703658ba-7ce2-4241-89dd-7ae2ebf99936` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-36eb8bf2-880c-4368-9b17-bbbd6a2bfa12` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-1e560608-9f6f-44c2-887a-ac41924835d8` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-dd85f5e0-1bdf-4fe4-8aaa-b6d4e5be8c7f` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 12 | `qa-87b347ea-79f6-4e7d-a596-ce0bfeed5395` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-8d377e43-b246-4bbc-97aa-39f1953a0f8c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-abe2097d-5b02-4a96-87a3-c381c71c3039` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-04778acd-e7a5-4988-a352-264acae0630a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-b29d6302-2051-4df9-b5c1-67543618f82b` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-356565a2-3080-4885-b27e-f35de4ae1bb6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-703658ba-7ce2-4241-89dd-7ae2ebf99936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-703658ba-7ce2-4241-89dd-7ae2ebf99936
Content-Type: application/json

--- request body ---
{"handle":"qa-68a751b9aa68","displayName":"QA 68a751b9aa68","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-703658ba-7ce2-4241-89dd-7ae2ebf99936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-68a751b9aa68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79ab9d79-0644-4bdd-b0f2-c348e74a27d3","handle":"qa-68a751b9aa68","displayName":"QA 68a751b9aa68","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.876152659Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-36eb8bf2-880c-4368-9b17-bbbd6a2bfa12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36eb8bf2-880c-4368-9b17-bbbd6a2bfa12
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0406635353","displayName":"QA 6b0406635353","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-36eb8bf2-880c-4368-9b17-bbbd6a2bfa12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-6b0406635353
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a0e149ed-36e9-4386-bfc1-dbfd687b65b0","handle":"qa-6b0406635353","displayName":"QA 6b0406635353","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.924997195Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e560608-9f6f-44c2-887a-ac41924835d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e560608-9f6f-44c2-887a-ac41924835d8
Content-Type: application/json

--- request body ---
{"handle":"qa-68a751b9aa68","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e560608-9f6f-44c2-887a-ac41924835d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79ab9d79-0644-4bdd-b0f2-c348e74a27d3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dd85f5e0-1bdf-4fe4-8aaa-b6d4e5be8c7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd85f5e0-1bdf-4fe4-8aaa-b6d4e5be8c7f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b0406635353","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd85f5e0-1bdf-4fe4-8aaa-b6d4e5be8c7f
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
Location: /v1/conversations/cnv_60c12366-69b1-49a9-8abf-81a8da8a754b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_60c12366-69b1-49a9-8abf-81a8da8a754b","subject":"Error contract","status":"open","region":"eu","participants":["qa-68a751b9aa68","qa-6b0406635353"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.017194839Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_60c12366-69b1-49a9-8abf-81a8da8a754b/messages
correlation: qa-87b347ea-79f6-4e7d-a596-ce0bfeed5395

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: aabb039e-6cd0-4681-9bf3-9e08989fa098
X-Correlation-Id: qa-87b347ea-79f6-4e7d-a596-ce0bfeed5395
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87b347ea-79f6-4e7d-a596-ce0bfeed5395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_60c12366-69b1-49a9-8abf-81a8da8a754b/messages","correlationId":"qa-87b347ea-79f6-4e7d-a596-ce0bfeed5395"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8d377e43-b246-4bbc-97aa-39f1953a0f8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d377e43-b246-4bbc-97aa-39f1953a0f8c
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0406635353","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d377e43-b246-4bbc-97aa-39f1953a0f8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0e149ed-36e9-4386-bfc1-dbfd687b65b0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abe2097d-5b02-4a96-87a3-c381c71c3039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe2097d-5b02-4a96-87a3-c381c71c3039
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abe2097d-5b02-4a96-87a3-c381c71c3039
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
correlation: qa-04778acd-e7a5-4988-a352-264acae0630a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04778acd-e7a5-4988-a352-264acae0630a
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0406635353","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04778acd-e7a5-4988-a352-264acae0630a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04778acd-e7a5-4988-a352-264acae0630a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b29d6302-2051-4df9-b5c1-67543618f82b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b29d6302-2051-4df9-b5c1-67543618f82b
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b29d6302-2051-4df9-b5c1-67543618f82b
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
correlation: qa-356565a2-3080-4885-b27e-f35de4ae1bb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-356565a2-3080-4885-b27e-f35de4ae1bb6
Content-Type: application/json

--- request body ---
{"handle":"qa-68a751b9aa68","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-356565a2-3080-4885-b27e-f35de4ae1bb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-356565a2-3080-4885-b27e-f35de4ae1bb6"}
```
