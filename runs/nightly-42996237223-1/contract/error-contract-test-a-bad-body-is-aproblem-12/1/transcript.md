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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-5bb456dc-4eb5-4676-ab28-3630d212dc71` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-4eba17d0-1583-45bf-8066-ab6974d9bc8e` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-f5137edf-10fc-4341-9258-7474717e74ed` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-a8ecf396-c9f8-4ccb-8519-cc95b4ef8a83` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 8 | `qa-4c2f1e6f-3d83-4c33-920f-e1ca60adf2f6` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-ac5504c3-8574-4c10-b0e9-906d7f32aef4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8e95d6e7-f705-420f-82d6-30ecb80bf36c` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-fb7bc8b4-dda5-40b7-ad56-0d9f0ebaa39c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-daf2338a-20b9-473b-ba93-9ce0178b6a6d` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-152907a2-2d2f-4985-9397-bfe2be265d12` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5bb456dc-4eb5-4676-ab28-3630d212dc71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bb456dc-4eb5-4676-ab28-3630d212dc71
Content-Type: application/json

--- request body ---
{"handle":"qa-498ac9b4d12a","displayName":"QA 498ac9b4d12a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bb456dc-4eb5-4676-ab28-3630d212dc71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Location: /v1/accounts/qa-498ac9b4d12a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b4fd6f2-0895-4129-9334-5485150a6494","handle":"qa-498ac9b4d12a","displayName":"QA 498ac9b4d12a","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.578709052Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4eba17d0-1583-45bf-8066-ab6974d9bc8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eba17d0-1583-45bf-8066-ab6974d9bc8e
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba0f499f688","displayName":"QA 5ba0f499f688","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eba17d0-1583-45bf-8066-ab6974d9bc8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Location: /v1/accounts/qa-5ba0f499f688
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7849605-8ec2-42c1-b4c1-5b4017eede48","handle":"qa-5ba0f499f688","displayName":"QA 5ba0f499f688","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.609039077Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f5137edf-10fc-4341-9258-7474717e74ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5137edf-10fc-4341-9258-7474717e74ed
Content-Type: application/json

--- request body ---
{"handle":"qa-498ac9b4d12a","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5137edf-10fc-4341-9258-7474717e74ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b4fd6f2-0895-4129-9334-5485150a6494"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a8ecf396-c9f8-4ccb-8519-cc95b4ef8a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ecf396-c9f8-4ccb-8519-cc95b4ef8a83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ba0f499f688","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8ecf396-c9f8-4ccb-8519-cc95b4ef8a83
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
Location: /v1/conversations/cnv_87ad8560-767b-456e-8e44-2bb71f653af1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_87ad8560-767b-456e-8e44-2bb71f653af1","subject":"Error contract","status":"open","region":"eu","participants":["qa-498ac9b4d12a","qa-5ba0f499f688"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.659242917Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_87ad8560-767b-456e-8e44-2bb71f653af1/messages
correlation: qa-4c2f1e6f-3d83-4c33-920f-e1ca60adf2f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c2f1e6f-3d83-4c33-920f-e1ca60adf2f6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c2f1e6f-3d83-4c33-920f-e1ca60adf2f6
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_87ad8560-767b-456e-8e44-2bb71f653af1/messages","correlationId":"qa-4c2f1e6f-3d83-4c33-920f-e1ca60adf2f6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac5504c3-8574-4c10-b0e9-906d7f32aef4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac5504c3-8574-4c10-b0e9-906d7f32aef4
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba0f499f688","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac5504c3-8574-4c10-b0e9-906d7f32aef4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7849605-8ec2-42c1-b4c1-5b4017eede48"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e95d6e7-f705-420f-82d6-30ecb80bf36c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e95d6e7-f705-420f-82d6-30ecb80bf36c
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e95d6e7-f705-420f-82d6-30ecb80bf36c
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
correlation: qa-fb7bc8b4-dda5-40b7-ad56-0d9f0ebaa39c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb7bc8b4-dda5-40b7-ad56-0d9f0ebaa39c
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba0f499f688","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb7bc8b4-dda5-40b7-ad56-0d9f0ebaa39c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb7bc8b4-dda5-40b7-ad56-0d9f0ebaa39c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-daf2338a-20b9-473b-ba93-9ce0178b6a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daf2338a-20b9-473b-ba93-9ce0178b6a6d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-daf2338a-20b9-473b-ba93-9ce0178b6a6d
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
correlation: qa-152907a2-2d2f-4985-9397-bfe2be265d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-152907a2-2d2f-4985-9397-bfe2be265d12
Content-Type: application/json

--- request body ---
{"handle":"qa-498ac9b4d12a","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-152907a2-2d2f-4985-9397-bfe2be265d12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-152907a2-2d2f-4985-9397-bfe2be265d12"}
```
