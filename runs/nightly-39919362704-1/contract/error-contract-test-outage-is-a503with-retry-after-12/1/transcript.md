# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-ca0ff736-cbd2-4323-be8c-60f3ddea7beb` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-4c974ec2-1552-43e1-9127-c22711c709d7` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d138abd0-4960-447a-96d7-a7649b571303` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-487d3cc6-8fdd-49d4-a751-1348bb812f7f` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 33 | `qa-82cb35a9-323f-4e85-b963-c2cc5ddc4b17` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-c6d90247-472d-47c4-ab5a-0e2379f17b12` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-862be9c6-6514-4902-b0ba-291211eb4270` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-3e74800b-6b86-4a11-ac87-15d560c0dbe5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9f53d24d-50a4-43b2-afac-f50a33c31e17` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-d1f801d7-14a7-4ce5-94b5-587521e366a7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca0ff736-cbd2-4323-be8c-60f3ddea7beb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca0ff736-cbd2-4323-be8c-60f3ddea7beb
Content-Type: application/json

--- request body ---
{"handle":"qa-06a843df450c","displayName":"QA 06a843df450c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca0ff736-cbd2-4323-be8c-60f3ddea7beb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Location: /v1/accounts/qa-06a843df450c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b63be1d1-2eac-41da-a042-153b698315fc","handle":"qa-06a843df450c","displayName":"QA 06a843df450c","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.718376368Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4c974ec2-1552-43e1-9127-c22711c709d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c974ec2-1552-43e1-9127-c22711c709d7
Content-Type: application/json

--- request body ---
{"handle":"qa-0d8b42323140","displayName":"QA 0d8b42323140","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c974ec2-1552-43e1-9127-c22711c709d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Location: /v1/accounts/qa-0d8b42323140
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01078363-ccf0-4e9b-811a-5fff924c6609","handle":"qa-0d8b42323140","displayName":"QA 0d8b42323140","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.779770070Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d138abd0-4960-447a-96d7-a7649b571303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d138abd0-4960-447a-96d7-a7649b571303
Content-Type: application/json

--- request body ---
{"handle":"qa-06a843df450c","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d138abd0-4960-447a-96d7-a7649b571303
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b63be1d1-2eac-41da-a042-153b698315fc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-487d3cc6-8fdd-49d4-a751-1348bb812f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-487d3cc6-8fdd-49d4-a751-1348bb812f7f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0d8b42323140","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-487d3cc6-8fdd-49d4-a751-1348bb812f7f
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
Location: /v1/conversations/cnv_17d5f06d-1f15-4a7b-b373-dcc8a0cebba3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17d5f06d-1f15-4a7b-b373-dcc8a0cebba3","subject":"Error contract","status":"open","region":"eu","participants":["qa-06a843df450c","qa-0d8b42323140"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.840877811Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_17d5f06d-1f15-4a7b-b373-dcc8a0cebba3/close
correlation: qa-82cb35a9-323f-4e85-b963-c2cc5ddc4b17

--- request headers ---
Accept: application/json
X-Fault-Key: c1521f9a-48a9-49cb-9ff7-8b22b6a25045
X-Fault: unavailable-once
X-Correlation-Id: qa-82cb35a9-323f-4e85-b963-c2cc5ddc4b17
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82cb35a9-323f-4e85-b963-c2cc5ddc4b17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_17d5f06d-1f15-4a7b-b373-dcc8a0cebba3/close","correlationId":"qa-82cb35a9-323f-4e85-b963-c2cc5ddc4b17"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c6d90247-472d-47c4-ab5a-0e2379f17b12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d90247-472d-47c4-ab5a-0e2379f17b12
Content-Type: application/json

--- request body ---
{"handle":"qa-0d8b42323140","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d90247-472d-47c4-ab5a-0e2379f17b12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01078363-ccf0-4e9b-811a-5fff924c6609"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-862be9c6-6514-4902-b0ba-291211eb4270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-862be9c6-6514-4902-b0ba-291211eb4270
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-862be9c6-6514-4902-b0ba-291211eb4270
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
correlation: qa-3e74800b-6b86-4a11-ac87-15d560c0dbe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e74800b-6b86-4a11-ac87-15d560c0dbe5
Content-Type: application/json

--- request body ---
{"handle":"qa-0d8b42323140","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e74800b-6b86-4a11-ac87-15d560c0dbe5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e74800b-6b86-4a11-ac87-15d560c0dbe5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f53d24d-50a4-43b2-afac-f50a33c31e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f53d24d-50a4-43b2-afac-f50a33c31e17
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f53d24d-50a4-43b2-afac-f50a33c31e17
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
correlation: qa-d1f801d7-14a7-4ce5-94b5-587521e366a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1f801d7-14a7-4ce5-94b5-587521e366a7
Content-Type: application/json

--- request body ---
{"handle":"qa-06a843df450c","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1f801d7-14a7-4ce5-94b5-587521e366a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1f801d7-14a7-4ce5-94b5-587521e366a7"}
```
