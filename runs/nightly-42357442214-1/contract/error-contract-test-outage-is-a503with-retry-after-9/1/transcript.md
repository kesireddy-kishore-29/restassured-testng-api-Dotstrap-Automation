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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-0c62504a-2492-41b6-ad51-257853975307` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-9a377920-7eec-4d86-90ae-7e843739db43` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-721130b2-249b-476c-9d06-d7aa453bfb13` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-9b8e12a3-2e07-4236-bb49-0d43d2e54a5f` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 9 | `qa-788f3313-18cc-494d-a679-da19adf3cb53` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-c61fdcfc-3d6a-49d3-a7ae-009c5db8dc09` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4d43d22a-918d-4910-97e7-fd9c7b0b6395` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-4469214a-0cef-4d3b-b992-a5f58f84c3d3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2ae7e88b-ee29-42ff-85ff-7ba007928fc9` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-e62a3cbd-6da1-4954-9c95-0761b474fbd2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0c62504a-2492-41b6-ad51-257853975307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c62504a-2492-41b6-ad51-257853975307
Content-Type: application/json

--- request body ---
{"handle":"qa-06ba53ed9119","displayName":"QA 06ba53ed9119","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c62504a-2492-41b6-ad51-257853975307
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Location: /v1/accounts/qa-06ba53ed9119
X-Served-Region: eu
Content-Length: 181

{"id":"acc_73bf01ed-34ad-4610-b82e-af5d698b64c5","handle":"qa-06ba53ed9119","displayName":"QA 06ba53ed9119","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.829694005Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a377920-7eec-4d86-90ae-7e843739db43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a377920-7eec-4d86-90ae-7e843739db43
Content-Type: application/json

--- request body ---
{"handle":"qa-438e4fcb026b","displayName":"QA 438e4fcb026b","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a377920-7eec-4d86-90ae-7e843739db43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-438e4fcb026b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4384fa5c-7975-412e-9a02-b273268a3721","handle":"qa-438e4fcb026b","displayName":"QA 438e4fcb026b","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.867508954Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-721130b2-249b-476c-9d06-d7aa453bfb13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-721130b2-249b-476c-9d06-d7aa453bfb13
Content-Type: application/json

--- request body ---
{"handle":"qa-06ba53ed9119","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-721130b2-249b-476c-9d06-d7aa453bfb13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73bf01ed-34ad-4610-b82e-af5d698b64c5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9b8e12a3-2e07-4236-bb49-0d43d2e54a5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8e12a3-2e07-4236-bb49-0d43d2e54a5f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-438e4fcb026b","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b8e12a3-2e07-4236-bb49-0d43d2e54a5f
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
Location: /v1/conversations/cnv_d41b0b6c-5aa1-4c6a-8e41-3e17b78c6aee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d41b0b6c-5aa1-4c6a-8e41-3e17b78c6aee","subject":"Error contract","status":"open","region":"eu","participants":["qa-06ba53ed9119","qa-438e4fcb026b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.927389607Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_d41b0b6c-5aa1-4c6a-8e41-3e17b78c6aee/messages
correlation: qa-788f3313-18cc-494d-a679-da19adf3cb53

--- request headers ---
Accept: application/json
X-Fault-Key: 2e381b84-8936-4fa5-9062-321c6e8fa025
X-Fault: unavailable-once
X-Correlation-Id: qa-788f3313-18cc-494d-a679-da19adf3cb53
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-788f3313-18cc-494d-a679-da19adf3cb53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d41b0b6c-5aa1-4c6a-8e41-3e17b78c6aee/messages","correlationId":"qa-788f3313-18cc-494d-a679-da19adf3cb53"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c61fdcfc-3d6a-49d3-a7ae-009c5db8dc09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c61fdcfc-3d6a-49d3-a7ae-009c5db8dc09
Content-Type: application/json

--- request body ---
{"handle":"qa-438e4fcb026b","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c61fdcfc-3d6a-49d3-a7ae-009c5db8dc09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4384fa5c-7975-412e-9a02-b273268a3721"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d43d22a-918d-4910-97e7-fd9c7b0b6395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d43d22a-918d-4910-97e7-fd9c7b0b6395
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d43d22a-918d-4910-97e7-fd9c7b0b6395
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
correlation: qa-4469214a-0cef-4d3b-b992-a5f58f84c3d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4469214a-0cef-4d3b-b992-a5f58f84c3d3
Content-Type: application/json

--- request body ---
{"handle":"qa-438e4fcb026b","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4469214a-0cef-4d3b-b992-a5f58f84c3d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4469214a-0cef-4d3b-b992-a5f58f84c3d3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ae7e88b-ee29-42ff-85ff-7ba007928fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ae7e88b-ee29-42ff-85ff-7ba007928fc9
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ae7e88b-ee29-42ff-85ff-7ba007928fc9
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
correlation: qa-e62a3cbd-6da1-4954-9c95-0761b474fbd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e62a3cbd-6da1-4954-9c95-0761b474fbd2
Content-Type: application/json

--- request body ---
{"handle":"qa-06ba53ed9119","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e62a3cbd-6da1-4954-9c95-0761b474fbd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e62a3cbd-6da1-4954-9c95-0761b474fbd2"}
```
