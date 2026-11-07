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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-5d664d12-8580-4ffb-b31d-b1b9e0217f40` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-7531b3e9-e64e-4d3f-9339-94ce11e7c69f` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-cb2d1314-94b4-417c-9963-f909574f8f76` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-7be83165-f34a-4441-8772-9a8969d74f3b` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 22 | `qa-70cbd5fe-2151-445c-b932-7945255ed04c` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-5c232af6-896e-45fa-a697-f75ff0af2eeb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-3c093de8-92fa-419f-b20d-beda29bb85c5` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-ec077e41-2f07-4b3a-9be5-9f592e324ebd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-5f465851-a7f6-4cce-a58b-9453d7f73a42` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-0964979d-ed94-4bb0-a6d2-846ce560c203` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5d664d12-8580-4ffb-b31d-b1b9e0217f40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d664d12-8580-4ffb-b31d-b1b9e0217f40
Content-Type: application/json

--- request body ---
{"handle":"qa-66aecadb1401","displayName":"QA 66aecadb1401","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d664d12-8580-4ffb-b31d-b1b9e0217f40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Location: /v1/accounts/qa-66aecadb1401
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3158e7ae-4c8a-4448-a046-9d68e8067d92","handle":"qa-66aecadb1401","displayName":"QA 66aecadb1401","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.745862367Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7531b3e9-e64e-4d3f-9339-94ce11e7c69f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7531b3e9-e64e-4d3f-9339-94ce11e7c69f
Content-Type: application/json

--- request body ---
{"handle":"qa-f4389843b39e","displayName":"QA f4389843b39e","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7531b3e9-e64e-4d3f-9339-94ce11e7c69f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Location: /v1/accounts/qa-f4389843b39e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bba77c67-13ac-43fc-9726-233b4b8d9dfe","handle":"qa-f4389843b39e","displayName":"QA f4389843b39e","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.799305678Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cb2d1314-94b4-417c-9963-f909574f8f76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2d1314-94b4-417c-9963-f909574f8f76
Content-Type: application/json

--- request body ---
{"handle":"qa-66aecadb1401","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb2d1314-94b4-417c-9963-f909574f8f76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3158e7ae-4c8a-4448-a046-9d68e8067d92"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7be83165-f34a-4441-8772-9a8969d74f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7be83165-f34a-4441-8772-9a8969d74f3b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f4389843b39e","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7be83165-f34a-4441-8772-9a8969d74f3b
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
Location: /v1/conversations/cnv_0253d5cb-4af7-492c-bf4e-8961d93ee61f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0253d5cb-4af7-492c-bf4e-8961d93ee61f","subject":"Error contract","status":"open","region":"eu","participants":["qa-66aecadb1401","qa-f4389843b39e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.885079783Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_0253d5cb-4af7-492c-bf4e-8961d93ee61f/messages
correlation: qa-70cbd5fe-2151-445c-b932-7945255ed04c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c370241a-b440-40ec-bf9e-977132a18b7a
X-Correlation-Id: qa-70cbd5fe-2151-445c-b932-7945255ed04c
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70cbd5fe-2151-445c-b932-7945255ed04c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0253d5cb-4af7-492c-bf4e-8961d93ee61f/messages","correlationId":"qa-70cbd5fe-2151-445c-b932-7945255ed04c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c232af6-896e-45fa-a697-f75ff0af2eeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c232af6-896e-45fa-a697-f75ff0af2eeb
Content-Type: application/json

--- request body ---
{"handle":"qa-f4389843b39e","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c232af6-896e-45fa-a697-f75ff0af2eeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bba77c67-13ac-43fc-9726-233b4b8d9dfe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c093de8-92fa-419f-b20d-beda29bb85c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c093de8-92fa-419f-b20d-beda29bb85c5
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c093de8-92fa-419f-b20d-beda29bb85c5
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
correlation: qa-ec077e41-2f07-4b3a-9be5-9f592e324ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec077e41-2f07-4b3a-9be5-9f592e324ebd
Content-Type: application/json

--- request body ---
{"handle":"qa-f4389843b39e","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec077e41-2f07-4b3a-9be5-9f592e324ebd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec077e41-2f07-4b3a-9be5-9f592e324ebd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f465851-a7f6-4cce-a58b-9453d7f73a42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f465851-a7f6-4cce-a58b-9453d7f73a42
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f465851-a7f6-4cce-a58b-9453d7f73a42
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
correlation: qa-0964979d-ed94-4bb0-a6d2-846ce560c203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0964979d-ed94-4bb0-a6d2-846ce560c203
Content-Type: application/json

--- request body ---
{"handle":"qa-66aecadb1401","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0964979d-ed94-4bb0-a6d2-846ce560c203
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0964979d-ed94-4bb0-a6d2-846ce560c203"}
```
