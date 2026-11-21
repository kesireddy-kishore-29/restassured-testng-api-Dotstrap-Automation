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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-70dbfbd7-798c-4ced-b947-494e871d5925` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-93950a50-6b98-4adf-b843-9f670a809f5b` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-59124aa6-3aa2-416b-aa42-78417c1765e3` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-02eb7365-7b4a-4e23-b0b2-e25ed2a3ca85` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 21 | `qa-dbccffed-e1e5-40f7-8c2a-d44a08ad4acd` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-66e83c69-8bf8-47ce-907e-3dc955d02a2b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-13c47ccd-90b6-40f1-9cbc-6298458f76ae` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-df62d62c-b1dd-49d0-a14b-39fab7e53d21` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-76732c21-13d9-4d8b-8ac5-7d098aa581d3` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-7c19953e-7e6a-413a-b0d1-a36b5e1d4f6a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70dbfbd7-798c-4ced-b947-494e871d5925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70dbfbd7-798c-4ced-b947-494e871d5925
Content-Type: application/json

--- request body ---
{"handle":"qa-202fac538d6d","displayName":"QA 202fac538d6d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-70dbfbd7-798c-4ced-b947-494e871d5925
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Location: /v1/accounts/qa-202fac538d6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c790d55-6419-4d15-aa26-27695c764a41","handle":"qa-202fac538d6d","displayName":"QA 202fac538d6d","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.520652750Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-93950a50-6b98-4adf-b843-9f670a809f5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93950a50-6b98-4adf-b843-9f670a809f5b
Content-Type: application/json

--- request body ---
{"handle":"qa-4220cddd89b9","displayName":"QA 4220cddd89b9","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-93950a50-6b98-4adf-b843-9f670a809f5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-4220cddd89b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1762f74-1220-4728-81cd-6ab406e0e45e","handle":"qa-4220cddd89b9","displayName":"QA 4220cddd89b9","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.560585321Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-59124aa6-3aa2-416b-aa42-78417c1765e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59124aa6-3aa2-416b-aa42-78417c1765e3
Content-Type: application/json

--- request body ---
{"handle":"qa-202fac538d6d","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-59124aa6-3aa2-416b-aa42-78417c1765e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c790d55-6419-4d15-aa26-27695c764a41"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-02eb7365-7b4a-4e23-b0b2-e25ed2a3ca85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02eb7365-7b4a-4e23-b0b2-e25ed2a3ca85
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4220cddd89b9","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-02eb7365-7b4a-4e23-b0b2-e25ed2a3ca85
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
Location: /v1/conversations/cnv_1a0092ab-a40d-4137-9ce6-ae0d1db41546
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a0092ab-a40d-4137-9ce6-ae0d1db41546","subject":"Error contract","status":"open","region":"eu","participants":["qa-202fac538d6d","qa-4220cddd89b9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.615366083Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_1a0092ab-a40d-4137-9ce6-ae0d1db41546/messages
correlation: qa-dbccffed-e1e5-40f7-8c2a-d44a08ad4acd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 92cdf852-4b0c-4478-80a0-60f7af25bb59
X-Correlation-Id: qa-dbccffed-e1e5-40f7-8c2a-d44a08ad4acd
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbccffed-e1e5-40f7-8c2a-d44a08ad4acd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1a0092ab-a40d-4137-9ce6-ae0d1db41546/messages","correlationId":"qa-dbccffed-e1e5-40f7-8c2a-d44a08ad4acd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66e83c69-8bf8-47ce-907e-3dc955d02a2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66e83c69-8bf8-47ce-907e-3dc955d02a2b
Content-Type: application/json

--- request body ---
{"handle":"qa-4220cddd89b9","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-66e83c69-8bf8-47ce-907e-3dc955d02a2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1762f74-1220-4728-81cd-6ab406e0e45e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13c47ccd-90b6-40f1-9cbc-6298458f76ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13c47ccd-90b6-40f1-9cbc-6298458f76ae
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13c47ccd-90b6-40f1-9cbc-6298458f76ae
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
correlation: qa-df62d62c-b1dd-49d0-a14b-39fab7e53d21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df62d62c-b1dd-49d0-a14b-39fab7e53d21
Content-Type: application/json

--- request body ---
{"handle":"qa-4220cddd89b9","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df62d62c-b1dd-49d0-a14b-39fab7e53d21
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df62d62c-b1dd-49d0-a14b-39fab7e53d21"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76732c21-13d9-4d8b-8ac5-7d098aa581d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76732c21-13d9-4d8b-8ac5-7d098aa581d3
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76732c21-13d9-4d8b-8ac5-7d098aa581d3
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
correlation: qa-7c19953e-7e6a-413a-b0d1-a36b5e1d4f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c19953e-7e6a-413a-b0d1-a36b5e1d4f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-202fac538d6d","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c19953e-7e6a-413a-b0d1-a36b5e1d4f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c19953e-7e6a-413a-b0d1-a36b5e1d4f6a"}
```
