# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-3f9fc59d-c94d-4432-9f72-ed38cb325799` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-6262d564-5914-4494-bbd5-8a20c6d73501` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 6 | `qa-447a3160-1976-4fc2-91fa-5544f87d7f37` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-0e6f4d02-04e8-4eff-a5cf-6a565559d4e0` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-1ac7203d-c08c-4778-9c6c-02eed02dbba3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3f9fc59d-c94d-4432-9f72-ed38cb325799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9fc59d-c94d-4432-9f72-ed38cb325799
Content-Type: application/json

--- request body ---
{"handle":"qa-f5917b9f20a4","displayName":"QA f5917b9f20a4","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f9fc59d-c94d-4432-9f72-ed38cb325799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-f5917b9f20a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_551d3454-f32f-4a4e-a7ca-f4db00679f07","handle":"qa-f5917b9f20a4","displayName":"QA f5917b9f20a4","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.568226038Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6262d564-5914-4494-bbd5-8a20c6d73501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6262d564-5914-4494-bbd5-8a20c6d73501
Content-Type: application/json

--- request body ---
{"handle":"qa-f5917b9f20a4","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6262d564-5914-4494-bbd5-8a20c6d73501
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_551d3454-f32f-4a4e-a7ca-f4db00679f07"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-447a3160-1976-4fc2-91fa-5544f87d7f37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-447a3160-1976-4fc2-91fa-5544f87d7f37
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-447a3160-1976-4fc2-91fa-5544f87d7f37
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-447a3160-1976-4fc2-91fa-5544f87d7f37"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e6f4d02-04e8-4eff-a5cf-6a565559d4e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e6f4d02-04e8-4eff-a5cf-6a565559d4e0
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e6f4d02-04e8-4eff-a5cf-6a565559d4e0
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1ac7203d-c08c-4778-9c6c-02eed02dbba3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ac7203d-c08c-4778-9c6c-02eed02dbba3
Content-Type: application/json

--- request body ---
{"handle":"qa-f5917b9f20a4","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ac7203d-c08c-4778-9c6c-02eed02dbba3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ac7203d-c08c-4778-9c6c-02eed02dbba3"}
```
