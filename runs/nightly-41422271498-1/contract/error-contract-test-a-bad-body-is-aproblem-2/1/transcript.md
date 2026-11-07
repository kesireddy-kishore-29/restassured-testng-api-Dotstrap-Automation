# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 422 | `qa-448dd289-8d3d-4c1d-89ce-e82e383fcfa5` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-0f350230-9b0a-4b2a-9f53-977e706db9ed` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-ba7ab613-27cd-4ffc-b355-8460ce556263` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-287b1801-157d-437f-9e8b-0d72f4d7a814` |
| 5 | `POST /v1/auth/token` | 422 | 59 | `qa-c4e1009f-c76f-47c9-b741-799bb0c01e0b` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-550a5310-a880-49c9-887a-bec972814843` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-bb08e98d-41f8-425b-b5eb-ab2bd620e178` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-074278c6-e8c5-456b-a595-284dc77d06e2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-42ad6688-5c08-4e6e-bf98-d8bffcce9b39` |
| 10 | `POST /v1/auth/token` | 401 | 57 | `qa-0bbee23f-e955-4fe4-aef9-789675210af0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-448dd289-8d3d-4c1d-89ce-e82e383fcfa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-448dd289-8d3d-4c1d-89ce-e82e383fcfa5
Content-Type: application/json

--- request body ---
{"handle":"qa-9ccc4a4187ec","displayName":"QA 9ccc4a4187ec","password":"****","region":"eu"}

--- response: 201 in 422 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-448dd289-8d3d-4c1d-89ce-e82e383fcfa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Location: /v1/accounts/qa-9ccc4a4187ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da40dcfa-82b3-4423-bff7-b781795ca8f2","handle":"qa-9ccc4a4187ec","displayName":"QA 9ccc4a4187ec","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.716801936Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f350230-9b0a-4b2a-9f53-977e706db9ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f350230-9b0a-4b2a-9f53-977e706db9ed
Content-Type: application/json

--- request body ---
{"handle":"qa-c00f36cc30b7","displayName":"QA c00f36cc30b7","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f350230-9b0a-4b2a-9f53-977e706db9ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-c00f36cc30b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65d59ed9-694c-478c-b475-50aa3c83e210","handle":"qa-c00f36cc30b7","displayName":"QA c00f36cc30b7","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.979255554Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba7ab613-27cd-4ffc-b355-8460ce556263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba7ab613-27cd-4ffc-b355-8460ce556263
Content-Type: application/json

--- request body ---
{"handle":"qa-9ccc4a4187ec","password":"****"}

--- response: 200 in 76 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba7ab613-27cd-4ffc-b355-8460ce556263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da40dcfa-82b3-4423-bff7-b781795ca8f2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-287b1801-157d-437f-9e8b-0d72f4d7a814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-287b1801-157d-437f-9e8b-0d72f4d7a814
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c00f36cc30b7","subject":"Error contract","message":"Hi"}

--- response: 201 in 51 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-287b1801-157d-437f-9e8b-0d72f4d7a814
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
Location: /v1/conversations/cnv_67f1c39b-5dea-4432-9885-be63c0de5013
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_67f1c39b-5dea-4432-9885-be63c0de5013","subject":"Error contract","status":"open","region":"eu","participants":["qa-9ccc4a4187ec","qa-c00f36cc30b7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.178751984Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c4e1009f-c76f-47c9-b741-799bb0c01e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e1009f-c76f-47c9-b741-799bb0c01e0b
Content-Type: application/json

--- request body ---
{"handle":"qa-9ccc4a4187ec","password":"****","ttlSeconds":0}

--- response: 422 in 59 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4e1009f-c76f-47c9-b741-799bb0c01e0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-c4e1009f-c76f-47c9-b741-799bb0c01e0b","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-550a5310-a880-49c9-887a-bec972814843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550a5310-a880-49c9-887a-bec972814843
Content-Type: application/json

--- request body ---
{"handle":"qa-c00f36cc30b7","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-550a5310-a880-49c9-887a-bec972814843
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65d59ed9-694c-478c-b475-50aa3c83e210"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb08e98d-41f8-425b-b5eb-ab2bd620e178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb08e98d-41f8-425b-b5eb-ab2bd620e178
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb08e98d-41f8-425b-b5eb-ab2bd620e178
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
correlation: qa-074278c6-e8c5-456b-a595-284dc77d06e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074278c6-e8c5-456b-a595-284dc77d06e2
Content-Type: application/json

--- request body ---
{"handle":"qa-c00f36cc30b7","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-074278c6-e8c5-456b-a595-284dc77d06e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-074278c6-e8c5-456b-a595-284dc77d06e2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42ad6688-5c08-4e6e-bf98-d8bffcce9b39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42ad6688-5c08-4e6e-bf98-d8bffcce9b39
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42ad6688-5c08-4e6e-bf98-d8bffcce9b39
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
correlation: qa-0bbee23f-e955-4fe4-aef9-789675210af0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bbee23f-e955-4fe4-aef9-789675210af0
Content-Type: application/json

--- request body ---
{"handle":"qa-9ccc4a4187ec","password":"****"}

--- response: 401 in 57 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bbee23f-e955-4fe4-aef9-789675210af0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bbee23f-e955-4fe4-aef9-789675210af0"}
```
