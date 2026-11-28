# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 424 | `qa-80aa846f-24ff-49b7-87fd-b3db363c9644` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-5f1393cd-4d88-45a7-a1ec-a2745ee4ccc9` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-974d5e26-84fe-4fcc-8793-0e7e0a97c0ba` |
| 4 | `POST /v1/conversations` | 201 | 67 | `qa-270e7d17-f399-4841-a3d4-32e0588f7658` |
| 5 | `GET /v1/conversations/{id}` | 200 | 28 | `qa-a3579c5c-dd71-47a5-96bd-e83f1ad196a2` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-089e19be-57b2-4b2b-b685-88f1aa29913f` |
| 7 | `GET /v1/conversations/{id}` | 200 | 26 | `qa-6f3897ec-d232-4566-95b5-10b72e3750ab` |
| 8 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-6e243282-2dc5-488d-9316-f683c63f6907` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-567ed9f8-295d-48c0-9349-f352dbef6e79` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a6999744-f192-45f5-9490-7858e8ce5139` |
| 11 | `POST /v1/auth/token` | 401 | 21 | `qa-f5f9b676-134c-4476-a8bc-1f37f88d6a70` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-80aa846f-24ff-49b7-87fd-b3db363c9644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80aa846f-24ff-49b7-87fd-b3db363c9644
Content-Type: application/json

--- request body ---
{"handle":"qa-c2fce9c07d9b","displayName":"QA c2fce9c07d9b","password":"****","region":"in"}

--- response: 201 in 424 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-80aa846f-24ff-49b7-87fd-b3db363c9644
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-c2fce9c07d9b
X-Served-Region: in
Content-Length: 181

{"id":"acc_414840dc-f116-433f-b18c-8d95ea5fb089","handle":"qa-c2fce9c07d9b","displayName":"QA c2fce9c07d9b","region":"in","role":"user","createdAt":"2026-11-23T10:55:04.230699147Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f1393cd-4d88-45a7-a1ec-a2745ee4ccc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f1393cd-4d88-45a7-a1ec-a2745ee4ccc9
Content-Type: application/json

--- request body ---
{"handle":"qa-71784bb8ad09","displayName":"QA 71784bb8ad09","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f1393cd-4d88-45a7-a1ec-a2745ee4ccc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-71784bb8ad09
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c97084e6-926a-454e-acb7-26cfce1cd301","handle":"qa-71784bb8ad09","displayName":"QA 71784bb8ad09","region":"eu","role":"user","createdAt":"2026-11-23T10:55:04.642108528Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-974d5e26-84fe-4fcc-8793-0e7e0a97c0ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-974d5e26-84fe-4fcc-8793-0e7e0a97c0ba
Content-Type: application/json

--- request body ---
{"handle":"qa-c2fce9c07d9b","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-974d5e26-84fe-4fcc-8793-0e7e0a97c0ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_414840dc-f116-433f-b18c-8d95ea5fb089"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-270e7d17-f399-4841-a3d4-32e0588f7658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270e7d17-f399-4841-a3d4-32e0588f7658
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-71784bb8ad09","subject":"Across regions","message":"Namaste"}

--- response: 201 in 67 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-270e7d17-f399-4841-a3d4-32e0588f7658
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
X-Served-Region: in
Location: /v1/conversations/cnv_6ac92841-6d42-480d-b910-dcd006b3027b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6ac92841-6d42-480d-b910-dcd006b3027b","subject":"Across regions","status":"open","region":"eu","participants":["qa-c2fce9c07d9b","qa-71784bb8ad09"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:04.751941692Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_6ac92841-6d42-480d-b910-dcd006b3027b
correlation: qa-a3579c5c-dd71-47a5-96bd-e83f1ad196a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3579c5c-dd71-47a5-96bd-e83f1ad196a2
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3579c5c-dd71-47a5-96bd-e83f1ad196a2
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6ac92841-6d42-480d-b910-dcd006b3027b","subject":"Across regions","status":"open","region":"eu","participants":["qa-c2fce9c07d9b","qa-71784bb8ad09"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:04.751941692Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-089e19be-57b2-4b2b-b685-88f1aa29913f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-089e19be-57b2-4b2b-b685-88f1aa29913f
Content-Type: application/json

--- request body ---
{"handle":"qa-71784bb8ad09","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-089e19be-57b2-4b2b-b685-88f1aa29913f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c97084e6-926a-454e-acb7-26cfce1cd301"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6ac92841-6d42-480d-b910-dcd006b3027b
correlation: qa-6f3897ec-d232-4566-95b5-10b72e3750ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f3897ec-d232-4566-95b5-10b72e3750ab
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f3897ec-d232-4566-95b5-10b72e3750ab
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6ac92841-6d42-480d-b910-dcd006b3027b","subject":"Across regions","status":"open","region":"eu","participants":["qa-c2fce9c07d9b","qa-71784bb8ad09"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-23T10:55:04.751941692Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e243282-2dc5-488d-9316-f683c63f6907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e243282-2dc5-488d-9316-f683c63f6907
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e243282-2dc5-488d-9316-f683c63f6907
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-567ed9f8-295d-48c0-9349-f352dbef6e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-567ed9f8-295d-48c0-9349-f352dbef6e79
Content-Type: application/json

--- request body ---
{"handle":"qa-71784bb8ad09","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-567ed9f8-295d-48c0-9349-f352dbef6e79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-567ed9f8-295d-48c0-9349-f352dbef6e79"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6999744-f192-45f5-9490-7858e8ce5139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6999744-f192-45f5-9490-7858e8ce5139
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6999744-f192-45f5-9490-7858e8ce5139
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-f5f9b676-134c-4476-a8bc-1f37f88d6a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5f9b676-134c-4476-a8bc-1f37f88d6a70
Content-Type: application/json

--- request body ---
{"handle":"qa-c2fce9c07d9b","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5f9b676-134c-4476-a8bc-1f37f88d6a70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5f9b676-134c-4476-a8bc-1f37f88d6a70"}
```
