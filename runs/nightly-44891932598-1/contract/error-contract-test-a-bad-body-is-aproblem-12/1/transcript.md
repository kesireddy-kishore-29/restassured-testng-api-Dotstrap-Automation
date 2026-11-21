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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-e56be02e-ddd1-41a1-94d9-c55e7db87395` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-8d01baf8-0e1d-4006-ac17-f96ed621d263` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-d9cb18ea-b1d2-4627-940a-0574ad4f211e` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-284bfbbf-7b65-409f-97ee-e16e2f297fa7` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 52 | `qa-c450292d-82ca-4ae0-bf43-22a72fa678db` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-5b9305d3-221c-446a-b820-c240f2a748c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-18ea40ff-b8ca-467a-b627-c24177a3c9de` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-606ec8f4-6f01-4d2d-ba55-bf8ab3f36668` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-2877f4e0-19ee-43b5-b49a-3f4b5d245b4f` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-23c1023f-d98f-4bfc-865c-9df462ae4f9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e56be02e-ddd1-41a1-94d9-c55e7db87395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e56be02e-ddd1-41a1-94d9-c55e7db87395
Content-Type: application/json

--- request body ---
{"handle":"qa-018929605509","displayName":"QA 018929605509","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e56be02e-ddd1-41a1-94d9-c55e7db87395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-018929605509
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72e8ac69-b7f1-4f20-9ef8-3d8146a892c4","handle":"qa-018929605509","displayName":"QA 018929605509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.191663785Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8d01baf8-0e1d-4006-ac17-f96ed621d263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d01baf8-0e1d-4006-ac17-f96ed621d263
Content-Type: application/json

--- request body ---
{"handle":"qa-37158c7e68a8","displayName":"QA 37158c7e68a8","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d01baf8-0e1d-4006-ac17-f96ed621d263
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
Location: /v1/accounts/qa-37158c7e68a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60177028-a9e5-4e7d-8039-2d0a80863ead","handle":"qa-37158c7e68a8","displayName":"QA 37158c7e68a8","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.238592162Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9cb18ea-b1d2-4627-940a-0574ad4f211e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9cb18ea-b1d2-4627-940a-0574ad4f211e
Content-Type: application/json

--- request body ---
{"handle":"qa-018929605509","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9cb18ea-b1d2-4627-940a-0574ad4f211e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72e8ac69-b7f1-4f20-9ef8-3d8146a892c4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-284bfbbf-7b65-409f-97ee-e16e2f297fa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-284bfbbf-7b65-409f-97ee-e16e2f297fa7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-37158c7e68a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-284bfbbf-7b65-409f-97ee-e16e2f297fa7
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
Location: /v1/conversations/cnv_c7b22a02-3cf0-4243-825f-9b971ca57178
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c7b22a02-3cf0-4243-825f-9b971ca57178","subject":"Error contract","status":"open","region":"eu","participants":["qa-018929605509","qa-37158c7e68a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.326707116Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c7b22a02-3cf0-4243-825f-9b971ca57178/messages
correlation: qa-c450292d-82ca-4ae0-bf43-22a72fa678db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c450292d-82ca-4ae0-bf43-22a72fa678db
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c450292d-82ca-4ae0-bf43-22a72fa678db
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_c7b22a02-3cf0-4243-825f-9b971ca57178/messages","correlationId":"qa-c450292d-82ca-4ae0-bf43-22a72fa678db"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5b9305d3-221c-446a-b820-c240f2a748c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9305d3-221c-446a-b820-c240f2a748c2
Content-Type: application/json

--- request body ---
{"handle":"qa-37158c7e68a8","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b9305d3-221c-446a-b820-c240f2a748c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60177028-a9e5-4e7d-8039-2d0a80863ead"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18ea40ff-b8ca-467a-b627-c24177a3c9de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18ea40ff-b8ca-467a-b627-c24177a3c9de
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18ea40ff-b8ca-467a-b627-c24177a3c9de
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
correlation: qa-606ec8f4-6f01-4d2d-ba55-bf8ab3f36668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-606ec8f4-6f01-4d2d-ba55-bf8ab3f36668
Content-Type: application/json

--- request body ---
{"handle":"qa-37158c7e68a8","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-606ec8f4-6f01-4d2d-ba55-bf8ab3f36668
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-606ec8f4-6f01-4d2d-ba55-bf8ab3f36668"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2877f4e0-19ee-43b5-b49a-3f4b5d245b4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2877f4e0-19ee-43b5-b49a-3f4b5d245b4f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2877f4e0-19ee-43b5-b49a-3f4b5d245b4f
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
correlation: qa-23c1023f-d98f-4bfc-865c-9df462ae4f9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23c1023f-d98f-4bfc-865c-9df462ae4f9d
Content-Type: application/json

--- request body ---
{"handle":"qa-018929605509","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23c1023f-d98f-4bfc-865c-9df462ae4f9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23c1023f-d98f-4bfc-865c-9df462ae4f9d"}
```
