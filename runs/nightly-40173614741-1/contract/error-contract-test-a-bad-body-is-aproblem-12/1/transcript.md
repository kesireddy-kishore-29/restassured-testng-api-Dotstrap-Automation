# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-17c4990f-c732-4871-94f9-7314f230bb59` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-6c3886f2-6a1c-4f85-a450-cd2e7579ca5d` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-d0fbfa52-60b8-4c4d-a710-4a3fae8d398f` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-a1eea769-8195-4c19-9816-1f74badcd51c` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 30 | `qa-cc193dd0-471a-4947-b774-a9287f59cdb7` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-61f59bc0-5e9a-461c-9eaa-56390a7ce7d6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d290324e-4630-43e2-8096-20591b573a30` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-d904d196-6eec-43c8-a754-83d19781e1c0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8c887d78-26d2-4e03-bb85-5aac12b7db94` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-e3b5790a-8c8a-421e-9ccc-caf14b32ddd0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-17c4990f-c732-4871-94f9-7314f230bb59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c4990f-c732-4871-94f9-7314f230bb59
Content-Type: application/json

--- request body ---
{"handle":"qa-0c26786ca51a","displayName":"QA 0c26786ca51a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-17c4990f-c732-4871-94f9-7314f230bb59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Location: /v1/accounts/qa-0c26786ca51a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_839c5a27-e888-4424-8839-1b488cbafdf3","handle":"qa-0c26786ca51a","displayName":"QA 0c26786ca51a","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.694522617Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c3886f2-6a1c-4f85-a450-cd2e7579ca5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c3886f2-6a1c-4f85-a450-cd2e7579ca5d
Content-Type: application/json

--- request body ---
{"handle":"qa-54e2b30c7bcc","displayName":"QA 54e2b30c7bcc","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c3886f2-6a1c-4f85-a450-cd2e7579ca5d
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
Location: /v1/accounts/qa-54e2b30c7bcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1aba0284-0ba6-4bf9-9bab-e8c8b1e0d2be","handle":"qa-54e2b30c7bcc","displayName":"QA 54e2b30c7bcc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.742789623Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d0fbfa52-60b8-4c4d-a710-4a3fae8d398f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0fbfa52-60b8-4c4d-a710-4a3fae8d398f
Content-Type: application/json

--- request body ---
{"handle":"qa-0c26786ca51a","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0fbfa52-60b8-4c4d-a710-4a3fae8d398f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_839c5a27-e888-4424-8839-1b488cbafdf3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a1eea769-8195-4c19-9816-1f74badcd51c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1eea769-8195-4c19-9816-1f74badcd51c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54e2b30c7bcc","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1eea769-8195-4c19-9816-1f74badcd51c
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
Location: /v1/conversations/cnv_fb3878a2-ab1d-410b-89a3-7df8cfec4daf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fb3878a2-ab1d-410b-89a3-7df8cfec4daf","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c26786ca51a","qa-54e2b30c7bcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.803017798Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_fb3878a2-ab1d-410b-89a3-7df8cfec4daf/messages
correlation: qa-cc193dd0-471a-4947-b774-a9287f59cdb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc193dd0-471a-4947-b774-a9287f59cdb7
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc193dd0-471a-4947-b774-a9287f59cdb7
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_fb3878a2-ab1d-410b-89a3-7df8cfec4daf/messages","correlationId":"qa-cc193dd0-471a-4947-b774-a9287f59cdb7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-61f59bc0-5e9a-461c-9eaa-56390a7ce7d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f59bc0-5e9a-461c-9eaa-56390a7ce7d6
Content-Type: application/json

--- request body ---
{"handle":"qa-54e2b30c7bcc","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-61f59bc0-5e9a-461c-9eaa-56390a7ce7d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1aba0284-0ba6-4bf9-9bab-e8c8b1e0d2be"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d290324e-4630-43e2-8096-20591b573a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d290324e-4630-43e2-8096-20591b573a30
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d290324e-4630-43e2-8096-20591b573a30
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
correlation: qa-d904d196-6eec-43c8-a754-83d19781e1c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d904d196-6eec-43c8-a754-83d19781e1c0
Content-Type: application/json

--- request body ---
{"handle":"qa-54e2b30c7bcc","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d904d196-6eec-43c8-a754-83d19781e1c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d904d196-6eec-43c8-a754-83d19781e1c0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c887d78-26d2-4e03-bb85-5aac12b7db94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c887d78-26d2-4e03-bb85-5aac12b7db94
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c887d78-26d2-4e03-bb85-5aac12b7db94
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e3b5790a-8c8a-421e-9ccc-caf14b32ddd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b5790a-8c8a-421e-9ccc-caf14b32ddd0
Content-Type: application/json

--- request body ---
{"handle":"qa-0c26786ca51a","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3b5790a-8c8a-421e-9ccc-caf14b32ddd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3b5790a-8c8a-421e-9ccc-caf14b32ddd0"}
```
