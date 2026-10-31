# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-0d0b6c2d-efe1-42bc-b6f5-dd9f9d7fcfad` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-f9eb102e-5a8b-41b6-b1ef-fb1cc0f66b2e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-10d6c80e-1098-42c5-949c-e960f4c7abed` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-627e4808-fb9a-4503-8b74-9b9087fe5ac5` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 31 | `qa-b7f21226-7fa2-4da9-9deb-1640d58874ae` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-b1f3578d-7ed2-43c0-8db1-6a53768486e4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-78405683-1262-4759-bddf-ae4b0d8cac56` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-c395ddf0-1b59-47a3-bfcf-cda40cbeafa9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-c521d271-b8ad-4165-ad81-f93600c740db` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-dc58e880-24c7-4993-81fa-0edd7b58b391` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d0b6c2d-efe1-42bc-b6f5-dd9f9d7fcfad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d0b6c2d-efe1-42bc-b6f5-dd9f9d7fcfad
Content-Type: application/json

--- request body ---
{"handle":"qa-0faec853693f","displayName":"QA 0faec853693f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d0b6c2d-efe1-42bc-b6f5-dd9f9d7fcfad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Location: /v1/accounts/qa-0faec853693f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0647072-674d-437d-8097-628f48d722b5","handle":"qa-0faec853693f","displayName":"QA 0faec853693f","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.429312157Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f9eb102e-5a8b-41b6-b1ef-fb1cc0f66b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9eb102e-5a8b-41b6-b1ef-fb1cc0f66b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-538316da6db4","displayName":"QA 538316da6db4","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9eb102e-5a8b-41b6-b1ef-fb1cc0f66b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Location: /v1/accounts/qa-538316da6db4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75d22f7c-8900-4176-bc36-ff0977fd45bc","handle":"qa-538316da6db4","displayName":"QA 538316da6db4","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.472350505Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-10d6c80e-1098-42c5-949c-e960f4c7abed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d6c80e-1098-42c5-949c-e960f4c7abed
Content-Type: application/json

--- request body ---
{"handle":"qa-0faec853693f","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-10d6c80e-1098-42c5-949c-e960f4c7abed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0647072-674d-437d-8097-628f48d722b5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-627e4808-fb9a-4503-8b74-9b9087fe5ac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-627e4808-fb9a-4503-8b74-9b9087fe5ac5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-538316da6db4","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-627e4808-fb9a-4503-8b74-9b9087fe5ac5
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
Location: /v1/conversations/cnv_56be137c-f61e-4b9c-bf97-c963b1552290
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_56be137c-f61e-4b9c-bf97-c963b1552290","subject":"Error contract","status":"open","region":"eu","participants":["qa-0faec853693f","qa-538316da6db4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.558089162Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_56be137c-f61e-4b9c-bf97-c963b1552290/messages
correlation: qa-b7f21226-7fa2-4da9-9deb-1640d58874ae

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 74aead80-c6db-4b0d-b795-42e7fad516ff
X-Correlation-Id: qa-b7f21226-7fa2-4da9-9deb-1640d58874ae
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 31 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7f21226-7fa2-4da9-9deb-1640d58874ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_56be137c-f61e-4b9c-bf97-c963b1552290/messages","correlationId":"qa-b7f21226-7fa2-4da9-9deb-1640d58874ae"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b1f3578d-7ed2-43c0-8db1-6a53768486e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1f3578d-7ed2-43c0-8db1-6a53768486e4
Content-Type: application/json

--- request body ---
{"handle":"qa-538316da6db4","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1f3578d-7ed2-43c0-8db1-6a53768486e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75d22f7c-8900-4176-bc36-ff0977fd45bc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78405683-1262-4759-bddf-ae4b0d8cac56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78405683-1262-4759-bddf-ae4b0d8cac56
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78405683-1262-4759-bddf-ae4b0d8cac56
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
correlation: qa-c395ddf0-1b59-47a3-bfcf-cda40cbeafa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c395ddf0-1b59-47a3-bfcf-cda40cbeafa9
Content-Type: application/json

--- request body ---
{"handle":"qa-538316da6db4","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c395ddf0-1b59-47a3-bfcf-cda40cbeafa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c395ddf0-1b59-47a3-bfcf-cda40cbeafa9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c521d271-b8ad-4165-ad81-f93600c740db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c521d271-b8ad-4165-ad81-f93600c740db
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c521d271-b8ad-4165-ad81-f93600c740db
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
correlation: qa-dc58e880-24c7-4993-81fa-0edd7b58b391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc58e880-24c7-4993-81fa-0edd7b58b391
Content-Type: application/json

--- request body ---
{"handle":"qa-0faec853693f","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc58e880-24c7-4993-81fa-0edd7b58b391
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc58e880-24c7-4993-81fa-0edd7b58b391"}
```
