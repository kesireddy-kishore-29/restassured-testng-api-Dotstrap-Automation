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
| 1 | `POST /v1/accounts` | 201 | 475 | `qa-5ab3328b-3c67-477c-808b-69c2b7bc9dff` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-526cdd70-3f4e-4ee4-a8d1-bd36e6ef0053` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-ea644866-d838-445c-99ef-9bf43529552d` |
| 4 | `POST /v1/conversations` | 201 | 118 | `qa-4c3fea8e-5c39-497a-acae-03fd47091ba6` |
| 5 | `GET /v1/conversations/{id}` | 200 | 30 | `qa-66f7ce8a-8d01-4ba9-b20d-7b7714a5e9ba` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-10127133-89c0-4e81-8e90-6562ab4d7280` |
| 7 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-8addf485-64ca-47b5-bd40-5c1c898905c0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-7d1ef277-caf8-47bb-bde5-14768530811a` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-2d87c89d-dd65-489c-89c1-e99e41854903` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-419b6204-5573-4bb3-bc0a-996166064e91` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-326b5b0f-ae34-45c8-8cd5-2568c57eb7b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ab3328b-3c67-477c-808b-69c2b7bc9dff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab3328b-3c67-477c-808b-69c2b7bc9dff
Content-Type: application/json

--- request body ---
{"handle":"qa-5444a28b1479","displayName":"QA 5444a28b1479","password":"****","region":"in"}

--- response: 201 in 475 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ab3328b-3c67-477c-808b-69c2b7bc9dff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-5444a28b1479
X-Served-Region: in
Content-Length: 181

{"id":"acc_237fc597-35ed-419a-906e-10178e6f9c0e","handle":"qa-5444a28b1479","displayName":"QA 5444a28b1479","region":"in","role":"user","createdAt":"2026-11-25T11:27:53.388138122Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-526cdd70-3f4e-4ee4-a8d1-bd36e6ef0053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-526cdd70-3f4e-4ee4-a8d1-bd36e6ef0053
Content-Type: application/json

--- request body ---
{"handle":"qa-489027fdf3c4","displayName":"QA 489027fdf3c4","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-526cdd70-3f4e-4ee4-a8d1-bd36e6ef0053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-489027fdf3c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dafae00a-c850-4a27-becd-bbaccab4c3d1","handle":"qa-489027fdf3c4","displayName":"QA 489027fdf3c4","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.861336394Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ea644866-d838-445c-99ef-9bf43529552d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea644866-d838-445c-99ef-9bf43529552d
Content-Type: application/json

--- request body ---
{"handle":"qa-5444a28b1479","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea644866-d838-445c-99ef-9bf43529552d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_237fc597-35ed-419a-906e-10178e6f9c0e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4c3fea8e-5c39-497a-acae-03fd47091ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c3fea8e-5c39-497a-acae-03fd47091ba6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-489027fdf3c4","subject":"Across regions","message":"Namaste"}

--- response: 201 in 118 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c3fea8e-5c39-497a-acae-03fd47091ba6
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
Location: /v1/conversations/cnv_dfde73e6-556c-4ed1-8366-9bea74fa0c1f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dfde73e6-556c-4ed1-8366-9bea74fa0c1f","subject":"Across regions","status":"open","region":"eu","participants":["qa-5444a28b1479","qa-489027fdf3c4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:54.034928591Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_dfde73e6-556c-4ed1-8366-9bea74fa0c1f
correlation: qa-66f7ce8a-8d01-4ba9-b20d-7b7714a5e9ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f7ce8a-8d01-4ba9-b20d-7b7714a5e9ba
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-66f7ce8a-8d01-4ba9-b20d-7b7714a5e9ba
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

{"id":"cnv_dfde73e6-556c-4ed1-8366-9bea74fa0c1f","subject":"Across regions","status":"open","region":"eu","participants":["qa-5444a28b1479","qa-489027fdf3c4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:54.034928591Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-10127133-89c0-4e81-8e90-6562ab4d7280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10127133-89c0-4e81-8e90-6562ab4d7280
Content-Type: application/json

--- request body ---
{"handle":"qa-489027fdf3c4","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-10127133-89c0-4e81-8e90-6562ab4d7280
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dafae00a-c850-4a27-becd-bbaccab4c3d1"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_dfde73e6-556c-4ed1-8366-9bea74fa0c1f
correlation: qa-8addf485-64ca-47b5-bd40-5c1c898905c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8addf485-64ca-47b5-bd40-5c1c898905c0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8addf485-64ca-47b5-bd40-5c1c898905c0
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

{"id":"cnv_dfde73e6-556c-4ed1-8366-9bea74fa0c1f","subject":"Across regions","status":"open","region":"eu","participants":["qa-5444a28b1479","qa-489027fdf3c4"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-25T11:27:54.034928591Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d1ef277-caf8-47bb-bde5-14768530811a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d1ef277-caf8-47bb-bde5-14768530811a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d1ef277-caf8-47bb-bde5-14768530811a
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
correlation: qa-2d87c89d-dd65-489c-89c1-e99e41854903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d87c89d-dd65-489c-89c1-e99e41854903
Content-Type: application/json

--- request body ---
{"handle":"qa-489027fdf3c4","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d87c89d-dd65-489c-89c1-e99e41854903
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d87c89d-dd65-489c-89c1-e99e41854903"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-419b6204-5573-4bb3-bc0a-996166064e91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-419b6204-5573-4bb3-bc0a-996166064e91
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-419b6204-5573-4bb3-bc0a-996166064e91
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
correlation: qa-326b5b0f-ae34-45c8-8cd5-2568c57eb7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-326b5b0f-ae34-45c8-8cd5-2568c57eb7b0
Content-Type: application/json

--- request body ---
{"handle":"qa-5444a28b1479","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-326b5b0f-ae34-45c8-8cd5-2568c57eb7b0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-326b5b0f-ae34-45c8-8cd5-2568c57eb7b0"}
```
