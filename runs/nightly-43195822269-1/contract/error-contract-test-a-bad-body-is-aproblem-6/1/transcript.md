# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 66 | `qa-7aaa6137-f96c-4dd7-9916-631e1b9e387f` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-bba12a53-2341-4f72-a845-1cb7e8a0696b` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-aeaf53f6-bb6b-41ab-acb5-b1e4ee2b86d0` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-ab120ff2-e864-4700-a9c3-2b932adcd168` |
| 5 | `PATCH /v1/accounts/me` | 400 | 19 | `qa-49b5c193-39d2-4605-be19-26575b742081` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-c33c1a18-2098-470d-9f26-812f22767716` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ab7cc583-0a42-4a4b-9a6b-355e89373b14` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-7c0f7dfd-1f9e-4032-994e-0195b96f21fe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-768c7c68-7ab0-4df2-93af-cf1aa30daac3` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-18851245-2fdf-4c54-87d0-10d526655555` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7aaa6137-f96c-4dd7-9916-631e1b9e387f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aaa6137-f96c-4dd7-9916-631e1b9e387f
Content-Type: application/json

--- request body ---
{"handle":"qa-107284d7c6fd","displayName":"QA 107284d7c6fd","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7aaa6137-f96c-4dd7-9916-631e1b9e387f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 9
Location: /v1/accounts/qa-107284d7c6fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a829d4e-fa50-46ca-9a34-5b11f95f899e","handle":"qa-107284d7c6fd","displayName":"QA 107284d7c6fd","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.168249246Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bba12a53-2341-4f72-a845-1cb7e8a0696b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bba12a53-2341-4f72-a845-1cb7e8a0696b
Content-Type: application/json

--- request body ---
{"handle":"qa-a149287ab4c6","displayName":"QA a149287ab4c6","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bba12a53-2341-4f72-a845-1cb7e8a0696b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Location: /v1/accounts/qa-a149287ab4c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d341ff9e-0c9b-4502-bd89-e8ebd49b1681","handle":"qa-a149287ab4c6","displayName":"QA a149287ab4c6","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.231681583Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aeaf53f6-bb6b-41ab-acb5-b1e4ee2b86d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeaf53f6-bb6b-41ab-acb5-b1e4ee2b86d0
Content-Type: application/json

--- request body ---
{"handle":"qa-107284d7c6fd","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeaf53f6-bb6b-41ab-acb5-b1e4ee2b86d0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a829d4e-fa50-46ca-9a34-5b11f95f899e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ab120ff2-e864-4700-a9c3-2b932adcd168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab120ff2-e864-4700-a9c3-2b932adcd168
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a149287ab4c6","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab120ff2-e864-4700-a9c3-2b932adcd168
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
Location: /v1/conversations/cnv_275e5d5d-f26b-4c4e-a7d0-2b54d5b00544
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_275e5d5d-f26b-4c4e-a7d0-2b54d5b00544","subject":"Error contract","status":"open","region":"eu","participants":["qa-107284d7c6fd","qa-a149287ab4c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.286783973Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-49b5c193-39d2-4605-be19-26575b742081

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b5c193-39d2-4605-be19-26575b742081
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49b5c193-39d2-4605-be19-26575b742081
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-49b5c193-39d2-4605-be19-26575b742081"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c33c1a18-2098-470d-9f26-812f22767716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c33c1a18-2098-470d-9f26-812f22767716
Content-Type: application/json

--- request body ---
{"handle":"qa-a149287ab4c6","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c33c1a18-2098-470d-9f26-812f22767716
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d341ff9e-0c9b-4502-bd89-e8ebd49b1681"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab7cc583-0a42-4a4b-9a6b-355e89373b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7cc583-0a42-4a4b-9a6b-355e89373b14
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab7cc583-0a42-4a4b-9a6b-355e89373b14
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
correlation: qa-7c0f7dfd-1f9e-4032-994e-0195b96f21fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0f7dfd-1f9e-4032-994e-0195b96f21fe
Content-Type: application/json

--- request body ---
{"handle":"qa-a149287ab4c6","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c0f7dfd-1f9e-4032-994e-0195b96f21fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c0f7dfd-1f9e-4032-994e-0195b96f21fe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-768c7c68-7ab0-4df2-93af-cf1aa30daac3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-768c7c68-7ab0-4df2-93af-cf1aa30daac3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-768c7c68-7ab0-4df2-93af-cf1aa30daac3
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
correlation: qa-18851245-2fdf-4c54-87d0-10d526655555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18851245-2fdf-4c54-87d0-10d526655555
Content-Type: application/json

--- request body ---
{"handle":"qa-107284d7c6fd","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18851245-2fdf-4c54-87d0-10d526655555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18851245-2fdf-4c54-87d0-10d526655555"}
```
