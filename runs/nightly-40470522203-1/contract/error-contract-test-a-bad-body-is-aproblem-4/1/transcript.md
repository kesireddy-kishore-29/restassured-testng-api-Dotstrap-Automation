# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 87 | `qa-cb6adebc-b4fa-49a7-a4e8-cb3a908f6f96` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-c37c9d25-d363-46b1-97a3-51babc47f821` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-c5c32bd5-c63f-45f2-b8d8-e0b9b8c765d5` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-319e7727-5a80-4c92-aabf-6435b0fd790d` |
| 5 | `POST /v1/accounts` | 415 | 24 | `qa-77e415ed-9e22-48de-b5bc-cfc95b63ef90` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-b9ac2324-dde2-487f-8c21-dd90e87df9d4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8556b537-c657-4b8e-b90d-79eff0b103ec` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-50715a74-b84e-4cd9-b2ba-0b7173f7490b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-28443106-638e-4c70-87d3-7ed7182e8c00` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-b816130a-a59a-4fe8-8591-43b8c6ba4717` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb6adebc-b4fa-49a7-a4e8-cb3a908f6f96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb6adebc-b4fa-49a7-a4e8-cb3a908f6f96
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed32f132f42","displayName":"QA 3ed32f132f42","password":"****","region":"eu"}

--- response: 201 in 87 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb6adebc-b4fa-49a7-a4e8-cb3a908f6f96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-3ed32f132f42
X-Served-Region: eu
Content-Length: 181

{"id":"acc_478fc491-1e85-4019-8a9f-8c09a697ca64","handle":"qa-3ed32f132f42","displayName":"QA 3ed32f132f42","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.151860941Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c37c9d25-d363-46b1-97a3-51babc47f821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c37c9d25-d363-46b1-97a3-51babc47f821
Content-Type: application/json

--- request body ---
{"handle":"qa-10c7733d3fc0","displayName":"QA 10c7733d3fc0","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c37c9d25-d363-46b1-97a3-51babc47f821
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 7
Location: /v1/accounts/qa-10c7733d3fc0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48fc2c94-3835-4823-8695-7640e88b2048","handle":"qa-10c7733d3fc0","displayName":"QA 10c7733d3fc0","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.237257175Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c5c32bd5-c63f-45f2-b8d8-e0b9b8c765d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c32bd5-c63f-45f2-b8d8-e0b9b8c765d5
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed32f132f42","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5c32bd5-c63f-45f2-b8d8-e0b9b8c765d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_478fc491-1e85-4019-8a9f-8c09a697ca64"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-319e7727-5a80-4c92-aabf-6435b0fd790d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-319e7727-5a80-4c92-aabf-6435b0fd790d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-10c7733d3fc0","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-319e7727-5a80-4c92-aabf-6435b0fd790d
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
Location: /v1/conversations/cnv_defcbc89-96ef-41ef-9cfd-9ead5be3a89b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_defcbc89-96ef-41ef-9cfd-9ead5be3a89b","subject":"Error contract","status":"open","region":"eu","participants":["qa-3ed32f132f42","qa-10c7733d3fc0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.358563946Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-77e415ed-9e22-48de-b5bc-cfc95b63ef90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e415ed-9e22-48de-b5bc-cfc95b63ef90
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77e415ed-9e22-48de-b5bc-cfc95b63ef90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-77e415ed-9e22-48de-b5bc-cfc95b63ef90"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9ac2324-dde2-487f-8c21-dd90e87df9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9ac2324-dde2-487f-8c21-dd90e87df9d4
Content-Type: application/json

--- request body ---
{"handle":"qa-10c7733d3fc0","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9ac2324-dde2-487f-8c21-dd90e87df9d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48fc2c94-3835-4823-8695-7640e88b2048"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8556b537-c657-4b8e-b90d-79eff0b103ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8556b537-c657-4b8e-b90d-79eff0b103ec
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8556b537-c657-4b8e-b90d-79eff0b103ec
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
correlation: qa-50715a74-b84e-4cd9-b2ba-0b7173f7490b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50715a74-b84e-4cd9-b2ba-0b7173f7490b
Content-Type: application/json

--- request body ---
{"handle":"qa-10c7733d3fc0","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50715a74-b84e-4cd9-b2ba-0b7173f7490b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50715a74-b84e-4cd9-b2ba-0b7173f7490b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28443106-638e-4c70-87d3-7ed7182e8c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28443106-638e-4c70-87d3-7ed7182e8c00
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28443106-638e-4c70-87d3-7ed7182e8c00
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
correlation: qa-b816130a-a59a-4fe8-8591-43b8c6ba4717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b816130a-a59a-4fe8-8591-43b8c6ba4717
Content-Type: application/json

--- request body ---
{"handle":"qa-3ed32f132f42","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b816130a-a59a-4fe8-8591-43b8c6ba4717
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b816130a-a59a-4fe8-8591-43b8c6ba4717"}
```
