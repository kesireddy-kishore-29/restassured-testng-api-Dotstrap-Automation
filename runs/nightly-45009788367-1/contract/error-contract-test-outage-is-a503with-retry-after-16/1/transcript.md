# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-638b581d-a428-40d3-b2a5-e826a6763e04` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-4db27e47-b102-4f45-a974-75cfa17ee4a9` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-6d27babe-a60c-4320-88e7-b545a99e5a11` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-6a6f019e-3cb9-4449-8621-335d6ca8cb49` |
| 5 | `GET /v1/admin/stats` | 503 | 11 | `qa-20ba8fa4-9844-49e1-9bd9-1cc16f64fc24` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-6cc93d1b-d177-42f6-8597-def61ac2ee28` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0bca05cc-cb7c-4f6c-ba62-2797ef7a27f3` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-69c66044-81cf-4672-9dd3-8047fbd0df55` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-d09e010f-8c03-4a57-93ab-7c4fe9dfe6a4` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-759e6967-1449-41a1-a9c6-fbc98c318712` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-638b581d-a428-40d3-b2a5-e826a6763e04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-638b581d-a428-40d3-b2a5-e826a6763e04
Content-Type: application/json

--- request body ---
{"handle":"qa-60bc28c5567c","displayName":"QA 60bc28c5567c","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-638b581d-a428-40d3-b2a5-e826a6763e04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 8
Location: /v1/accounts/qa-60bc28c5567c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3921c304-e864-4bec-9d8f-67c227c21437","handle":"qa-60bc28c5567c","displayName":"QA 60bc28c5567c","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.344868932Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4db27e47-b102-4f45-a974-75cfa17ee4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4db27e47-b102-4f45-a974-75cfa17ee4a9
Content-Type: application/json

--- request body ---
{"handle":"qa-ddc2355d58ca","displayName":"QA ddc2355d58ca","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4db27e47-b102-4f45-a974-75cfa17ee4a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Location: /v1/accounts/qa-ddc2355d58ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_172aaf56-e7a4-477f-8bae-f585c7363d37","handle":"qa-ddc2355d58ca","displayName":"QA ddc2355d58ca","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.358898745Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6d27babe-a60c-4320-88e7-b545a99e5a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d27babe-a60c-4320-88e7-b545a99e5a11
Content-Type: application/json

--- request body ---
{"handle":"qa-60bc28c5567c","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d27babe-a60c-4320-88e7-b545a99e5a11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3921c304-e864-4bec-9d8f-67c227c21437"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a6f019e-3cb9-4449-8621-335d6ca8cb49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a6f019e-3cb9-4449-8621-335d6ca8cb49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ddc2355d58ca","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a6f019e-3cb9-4449-8621-335d6ca8cb49
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
Location: /v1/conversations/cnv_2f089af2-1b90-421c-8888-2a9ffbf5ed08
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2f089af2-1b90-421c-8888-2a9ffbf5ed08","subject":"Error contract","status":"open","region":"eu","participants":["qa-60bc28c5567c","qa-ddc2355d58ca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.400719017Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-20ba8fa4-9844-49e1-9bd9-1cc16f64fc24

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9e2daee7-e73a-4dc4-8441-b376177b3291
X-Correlation-Id: qa-20ba8fa4-9844-49e1-9bd9-1cc16f64fc24
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20ba8fa4-9844-49e1-9bd9-1cc16f64fc24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-20ba8fa4-9844-49e1-9bd9-1cc16f64fc24"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6cc93d1b-d177-42f6-8597-def61ac2ee28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cc93d1b-d177-42f6-8597-def61ac2ee28
Content-Type: application/json

--- request body ---
{"handle":"qa-ddc2355d58ca","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cc93d1b-d177-42f6-8597-def61ac2ee28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_172aaf56-e7a4-477f-8bae-f585c7363d37"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0bca05cc-cb7c-4f6c-ba62-2797ef7a27f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bca05cc-cb7c-4f6c-ba62-2797ef7a27f3
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0bca05cc-cb7c-4f6c-ba62-2797ef7a27f3
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
correlation: qa-69c66044-81cf-4672-9dd3-8047fbd0df55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c66044-81cf-4672-9dd3-8047fbd0df55
Content-Type: application/json

--- request body ---
{"handle":"qa-ddc2355d58ca","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69c66044-81cf-4672-9dd3-8047fbd0df55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69c66044-81cf-4672-9dd3-8047fbd0df55"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d09e010f-8c03-4a57-93ab-7c4fe9dfe6a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d09e010f-8c03-4a57-93ab-7c4fe9dfe6a4
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d09e010f-8c03-4a57-93ab-7c4fe9dfe6a4
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
correlation: qa-759e6967-1449-41a1-a9c6-fbc98c318712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-759e6967-1449-41a1-a9c6-fbc98c318712
Content-Type: application/json

--- request body ---
{"handle":"qa-60bc28c5567c","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-759e6967-1449-41a1-a9c6-fbc98c318712
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-759e6967-1449-41a1-a9c6-fbc98c318712"}
```
