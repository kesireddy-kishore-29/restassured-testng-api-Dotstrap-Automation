# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-d8030d6a-97c3-4ad4-a4ef-91afc739e317` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-13b323a2-8dd8-4464-a7aa-e7e38046893c` |
| 3 | `GET /v1/conversations/{id}` | 404 | 25 | `qa-9a6264cd-4215-4003-9957-994017d606fd` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 15 | `qa-29121c99-9c3d-4467-875d-1baacd648ce2` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0b4333bf-4ea6-48fe-8beb-abfa71a970f7` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-1251f45b-d652-4675-97d8-2085e4ba4939` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8030d6a-97c3-4ad4-a4ef-91afc739e317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8030d6a-97c3-4ad4-a4ef-91afc739e317
Content-Type: application/json

--- request body ---
{"handle":"qa-d0c11fadfc7a","displayName":"QA d0c11fadfc7a","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8030d6a-97c3-4ad4-a4ef-91afc739e317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-d0c11fadfc7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_395e198e-a622-4101-bb4a-94438733822f","handle":"qa-d0c11fadfc7a","displayName":"QA d0c11fadfc7a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:36.082602946Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13b323a2-8dd8-4464-a7aa-e7e38046893c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b323a2-8dd8-4464-a7aa-e7e38046893c
Content-Type: application/json

--- request body ---
{"handle":"qa-d0c11fadfc7a","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-13b323a2-8dd8-4464-a7aa-e7e38046893c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_395e198e-a622-4101-bb4a-94438733822f"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-9a6264cd-4215-4003-9957-994017d606fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6264cd-4215-4003-9957-994017d606fd
Content-Type: application/json

--- response: 404 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a6264cd-4215-4003-9957-994017d606fd
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-9a6264cd-4215-4003-9957-994017d606fd"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-29121c99-9c3d-4467-875d-1baacd648ce2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29121c99-9c3d-4467-875d-1baacd648ce2
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29121c99-9c3d-4467-875d-1baacd648ce2
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-29121c99-9c3d-4467-875d-1baacd648ce2"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b4333bf-4ea6-48fe-8beb-abfa71a970f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b4333bf-4ea6-48fe-8beb-abfa71a970f7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b4333bf-4ea6-48fe-8beb-abfa71a970f7
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1251f45b-d652-4675-97d8-2085e4ba4939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1251f45b-d652-4675-97d8-2085e4ba4939
Content-Type: application/json

--- request body ---
{"handle":"qa-d0c11fadfc7a","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1251f45b-d652-4675-97d8-2085e4ba4939
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1251f45b-d652-4675-97d8-2085e4ba4939"}
```
