# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-d7e83a03-24ca-4e8a-b18f-dbc6ec6e9144` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-0ad17d63-86b8-4cfe-b95b-fff1884287e4` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-84f5a8a8-4a73-4b96-bbf1-ceebd753d311` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-1c092990-8ed6-4fd1-a707-b0f27a46cebc` |
| 5 | `POST /v1/conversations` | 503 | 13 | `qa-d08671dd-9dbe-4a16-9d4b-700328650a39` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-ac443f5f-fb84-4237-9123-b4bb4fea1e7f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-5904074a-72c4-4815-809a-a307299aba97` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-659f4a33-c41f-49bd-a7e1-c324f287b640` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-23163b08-5caf-4cc6-ab20-1752a9b32d9b` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-cb180309-0bd6-44d3-a96c-1c3658a51ff2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d7e83a03-24ca-4e8a-b18f-dbc6ec6e9144

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e83a03-24ca-4e8a-b18f-dbc6ec6e9144
Content-Type: application/json

--- request body ---
{"handle":"qa-f268dadaab54","displayName":"QA f268dadaab54","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7e83a03-24ca-4e8a-b18f-dbc6ec6e9144
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Location: /v1/accounts/qa-f268dadaab54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6ddb5a1-b33d-4855-82ea-8ad3a3aa4be6","handle":"qa-f268dadaab54","displayName":"QA f268dadaab54","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.126519409Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0ad17d63-86b8-4cfe-b95b-fff1884287e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad17d63-86b8-4cfe-b95b-fff1884287e4
Content-Type: application/json

--- request body ---
{"handle":"qa-44a5f223c429","displayName":"QA 44a5f223c429","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ad17d63-86b8-4cfe-b95b-fff1884287e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-44a5f223c429
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a077b41-cba0-4f69-96c8-3c8728c71996","handle":"qa-44a5f223c429","displayName":"QA 44a5f223c429","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.175572978Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-84f5a8a8-4a73-4b96-bbf1-ceebd753d311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f5a8a8-4a73-4b96-bbf1-ceebd753d311
Content-Type: application/json

--- request body ---
{"handle":"qa-f268dadaab54","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-84f5a8a8-4a73-4b96-bbf1-ceebd753d311
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6ddb5a1-b33d-4855-82ea-8ad3a3aa4be6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1c092990-8ed6-4fd1-a707-b0f27a46cebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c092990-8ed6-4fd1-a707-b0f27a46cebc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-44a5f223c429","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c092990-8ed6-4fd1-a707-b0f27a46cebc
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
Location: /v1/conversations/cnv_095c817a-c4a2-4dcf-a19c-269037caaded
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_095c817a-c4a2-4dcf-a19c-269037caaded","subject":"Error contract","status":"open","region":"eu","participants":["qa-f268dadaab54","qa-44a5f223c429"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.261913225Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d08671dd-9dbe-4a16-9d4b-700328650a39

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f7d25b51-14c2-461d-b7ee-1e8ee37e1afd
X-Correlation-Id: qa-d08671dd-9dbe-4a16-9d4b-700328650a39
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f268dadaab54","subject":"Probe","message":"Hi"}

--- response: 503 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d08671dd-9dbe-4a16-9d4b-700328650a39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-d08671dd-9dbe-4a16-9d4b-700328650a39"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac443f5f-fb84-4237-9123-b4bb4fea1e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac443f5f-fb84-4237-9123-b4bb4fea1e7f
Content-Type: application/json

--- request body ---
{"handle":"qa-44a5f223c429","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac443f5f-fb84-4237-9123-b4bb4fea1e7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a077b41-cba0-4f69-96c8-3c8728c71996"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5904074a-72c4-4815-809a-a307299aba97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5904074a-72c4-4815-809a-a307299aba97
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5904074a-72c4-4815-809a-a307299aba97
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
correlation: qa-659f4a33-c41f-49bd-a7e1-c324f287b640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-659f4a33-c41f-49bd-a7e1-c324f287b640
Content-Type: application/json

--- request body ---
{"handle":"qa-44a5f223c429","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-659f4a33-c41f-49bd-a7e1-c324f287b640
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-659f4a33-c41f-49bd-a7e1-c324f287b640"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23163b08-5caf-4cc6-ab20-1752a9b32d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23163b08-5caf-4cc6-ab20-1752a9b32d9b
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23163b08-5caf-4cc6-ab20-1752a9b32d9b
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
correlation: qa-cb180309-0bd6-44d3-a96c-1c3658a51ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb180309-0bd6-44d3-a96c-1c3658a51ff2
Content-Type: application/json

--- request body ---
{"handle":"qa-f268dadaab54","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb180309-0bd6-44d3-a96c-1c3658a51ff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb180309-0bd6-44d3-a96c-1c3658a51ff2"}
```
