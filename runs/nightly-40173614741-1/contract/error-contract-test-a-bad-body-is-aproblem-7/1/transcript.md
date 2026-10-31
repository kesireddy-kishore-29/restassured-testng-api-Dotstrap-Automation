# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-9d051ce0-3a06-47a8-8f42-a1a900c42906` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-f369c1cc-bff2-443e-81c8-2d3dc09796e3` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-f1441c3f-7373-4a2a-9e48-86fe2b4f3def` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-d3ef307f-87e2-4400-8dfe-07863aa2f174` |
| 5 | `PATCH /v1/accounts/me` | 415 | 14 | `qa-e43aeae0-dd84-490a-8e1a-8f4e46cb6919` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-f7d01630-0e8b-4bba-8e02-84b948087ec3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-46dfcb5c-728c-4050-a422-8db91102c754` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-6368bc14-4778-4561-be1a-50262a691cca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-1283f260-dd72-44ab-8a8e-ee0b1be6169a` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-e8a311e2-4066-494b-b049-94cdb47d6b90` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d051ce0-3a06-47a8-8f42-a1a900c42906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d051ce0-3a06-47a8-8f42-a1a900c42906
Content-Type: application/json

--- request body ---
{"handle":"qa-021f8a9b12f6","displayName":"QA 021f8a9b12f6","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d051ce0-3a06-47a8-8f42-a1a900c42906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-021f8a9b12f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8248e1f-1106-4e24-b92a-4d5ecb7d421f","handle":"qa-021f8a9b12f6","displayName":"QA 021f8a9b12f6","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.666370460Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f369c1cc-bff2-443e-81c8-2d3dc09796e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f369c1cc-bff2-443e-81c8-2d3dc09796e3
Content-Type: application/json

--- request body ---
{"handle":"qa-8191e84dfe06","displayName":"QA 8191e84dfe06","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f369c1cc-bff2-443e-81c8-2d3dc09796e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-8191e84dfe06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b5bedf2-54d4-4209-a5e2-e16a40e96e76","handle":"qa-8191e84dfe06","displayName":"QA 8191e84dfe06","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.715110885Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f1441c3f-7373-4a2a-9e48-86fe2b4f3def

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1441c3f-7373-4a2a-9e48-86fe2b4f3def
Content-Type: application/json

--- request body ---
{"handle":"qa-021f8a9b12f6","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1441c3f-7373-4a2a-9e48-86fe2b4f3def
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8248e1f-1106-4e24-b92a-4d5ecb7d421f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d3ef307f-87e2-4400-8dfe-07863aa2f174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ef307f-87e2-4400-8dfe-07863aa2f174
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8191e84dfe06","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3ef307f-87e2-4400-8dfe-07863aa2f174
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
Location: /v1/conversations/cnv_e0b579b2-fac1-457c-89b5-492bc9c95c9c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e0b579b2-fac1-457c-89b5-492bc9c95c9c","subject":"Error contract","status":"open","region":"eu","participants":["qa-021f8a9b12f6","qa-8191e84dfe06"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.801446463Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e43aeae0-dd84-490a-8e1a-8f4e46cb6919

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e43aeae0-dd84-490a-8e1a-8f4e46cb6919
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e43aeae0-dd84-490a-8e1a-8f4e46cb6919
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-e43aeae0-dd84-490a-8e1a-8f4e46cb6919"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f7d01630-0e8b-4bba-8e02-84b948087ec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d01630-0e8b-4bba-8e02-84b948087ec3
Content-Type: application/json

--- request body ---
{"handle":"qa-8191e84dfe06","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7d01630-0e8b-4bba-8e02-84b948087ec3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b5bedf2-54d4-4209-a5e2-e16a40e96e76"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46dfcb5c-728c-4050-a422-8db91102c754

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46dfcb5c-728c-4050-a422-8db91102c754
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46dfcb5c-728c-4050-a422-8db91102c754
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
correlation: qa-6368bc14-4778-4561-be1a-50262a691cca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6368bc14-4778-4561-be1a-50262a691cca
Content-Type: application/json

--- request body ---
{"handle":"qa-8191e84dfe06","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6368bc14-4778-4561-be1a-50262a691cca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6368bc14-4778-4561-be1a-50262a691cca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1283f260-dd72-44ab-8a8e-ee0b1be6169a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1283f260-dd72-44ab-8a8e-ee0b1be6169a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1283f260-dd72-44ab-8a8e-ee0b1be6169a
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
correlation: qa-e8a311e2-4066-494b-b049-94cdb47d6b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a311e2-4066-494b-b049-94cdb47d6b90
Content-Type: application/json

--- request body ---
{"handle":"qa-021f8a9b12f6","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8a311e2-4066-494b-b049-94cdb47d6b90
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8a311e2-4066-494b-b049-94cdb47d6b90"}
```
