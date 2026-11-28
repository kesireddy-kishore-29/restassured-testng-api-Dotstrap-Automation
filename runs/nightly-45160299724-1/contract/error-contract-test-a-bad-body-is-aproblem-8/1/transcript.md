# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-51eccc31-dc0f-4fda-a744-2e30d123e414` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-f54d66cf-5a61-4c16-b0e7-79b4a2b0fd2a` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-5d612bf1-af4b-4268-81aa-e6bc69522034` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-16249721-a2a3-4d32-9785-898c294163ac` |
| 5 | `PATCH /v1/accounts/me` | 422 | 32 | `qa-b5c6acba-eb06-4ea8-8c7a-a0294ce2308c` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-9ead2b6e-10cb-4ffe-b230-508444ae0cdc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-16f85e77-b61d-4ce8-afd2-d69c7cc7db16` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-2430cc52-1807-4dcb-bfb3-f6a3d7f846e1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3b25522d-18ef-4a1f-a759-2fda63dcc691` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-7deb2fde-0935-46b9-a705-ccf467c60a7c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-51eccc31-dc0f-4fda-a744-2e30d123e414

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51eccc31-dc0f-4fda-a744-2e30d123e414
Content-Type: application/json

--- request body ---
{"handle":"qa-988551bd9c6d","displayName":"QA 988551bd9c6d","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-51eccc31-dc0f-4fda-a744-2e30d123e414
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
Location: /v1/accounts/qa-988551bd9c6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95318163-1f00-41f8-b612-d030b1f898dc","handle":"qa-988551bd9c6d","displayName":"QA 988551bd9c6d","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.327117305Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f54d66cf-5a61-4c16-b0e7-79b4a2b0fd2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f54d66cf-5a61-4c16-b0e7-79b4a2b0fd2a
Content-Type: application/json

--- request body ---
{"handle":"qa-34d6ea270ee2","displayName":"QA 34d6ea270ee2","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f54d66cf-5a61-4c16-b0e7-79b4a2b0fd2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-34d6ea270ee2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_014db22f-065e-444a-994f-723911cc68b2","handle":"qa-34d6ea270ee2","displayName":"QA 34d6ea270ee2","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.379451522Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5d612bf1-af4b-4268-81aa-e6bc69522034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d612bf1-af4b-4268-81aa-e6bc69522034
Content-Type: application/json

--- request body ---
{"handle":"qa-988551bd9c6d","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d612bf1-af4b-4268-81aa-e6bc69522034
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95318163-1f00-41f8-b612-d030b1f898dc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-16249721-a2a3-4d32-9785-898c294163ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16249721-a2a3-4d32-9785-898c294163ac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-34d6ea270ee2","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-16249721-a2a3-4d32-9785-898c294163ac
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
Location: /v1/conversations/cnv_8df155df-7619-4e73-8bc3-05befe7f614b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8df155df-7619-4e73-8bc3-05befe7f614b","subject":"Error contract","status":"open","region":"eu","participants":["qa-988551bd9c6d","qa-34d6ea270ee2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.460883206Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b5c6acba-eb06-4ea8-8c7a-a0294ce2308c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5c6acba-eb06-4ea8-8c7a-a0294ce2308c
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5c6acba-eb06-4ea8-8c7a-a0294ce2308c
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-b5c6acba-eb06-4ea8-8c7a-a0294ce2308c","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9ead2b6e-10cb-4ffe-b230-508444ae0cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ead2b6e-10cb-4ffe-b230-508444ae0cdc
Content-Type: application/json

--- request body ---
{"handle":"qa-34d6ea270ee2","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ead2b6e-10cb-4ffe-b230-508444ae0cdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_014db22f-065e-444a-994f-723911cc68b2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16f85e77-b61d-4ce8-afd2-d69c7cc7db16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f85e77-b61d-4ce8-afd2-d69c7cc7db16
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16f85e77-b61d-4ce8-afd2-d69c7cc7db16
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
correlation: qa-2430cc52-1807-4dcb-bfb3-f6a3d7f846e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2430cc52-1807-4dcb-bfb3-f6a3d7f846e1
Content-Type: application/json

--- request body ---
{"handle":"qa-34d6ea270ee2","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2430cc52-1807-4dcb-bfb3-f6a3d7f846e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2430cc52-1807-4dcb-bfb3-f6a3d7f846e1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b25522d-18ef-4a1f-a759-2fda63dcc691

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b25522d-18ef-4a1f-a759-2fda63dcc691
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b25522d-18ef-4a1f-a759-2fda63dcc691
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
correlation: qa-7deb2fde-0935-46b9-a705-ccf467c60a7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7deb2fde-0935-46b9-a705-ccf467c60a7c
Content-Type: application/json

--- request body ---
{"handle":"qa-988551bd9c6d","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7deb2fde-0935-46b9-a705-ccf467c60a7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7deb2fde-0935-46b9-a705-ccf467c60a7c"}
```
