# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-4ca497f4-283b-48d2-bf3d-c2c48bf2ce6f` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-b014586b-3d7b-48c5-86fb-cff9e59b91f7` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-abd8016e-6faa-4bdd-bf69-f94ac215e61a` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-6c4a2234-1514-4ac4-8a1e-025d1864e55a` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-62f155c2-d438-476d-b5fc-0106b6524e25` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-7878e897-97e9-41b8-a4ee-5ff469006c85` |
| 7 | `GET /v1/conversations/{id}` | 403 | 13 | `qa-96f4960a-8a41-44dc-b2a9-d59a7d84bcf8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-8ce41aab-6ee4-482f-9561-5ca18ce256fc` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-183457b5-6a58-4550-9c31-89ee8cd271e6` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-13b9d1f5-efc8-4328-9844-2ce1ca3eecf9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a668e6aa-4466-4dd4-a82c-2604894abee5` |
| 12 | `POST /v1/auth/token` | 401 | 22 | `qa-40d41226-6564-4f3c-8bdd-570a149cb340` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-4f22813a-c123-48a7-8fbe-7b4dc26dea26` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-33237937-73b5-4a59-977a-4b29ef3485a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ca497f4-283b-48d2-bf3d-c2c48bf2ce6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca497f4-283b-48d2-bf3d-c2c48bf2ce6f
Content-Type: application/json

--- request body ---
{"handle":"qa-1cdbee3dd48f","displayName":"QA 1cdbee3dd48f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ca497f4-283b-48d2-bf3d-c2c48bf2ce6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-1cdbee3dd48f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_843274b1-4ac8-4ae5-8766-aef3ac3bb932","handle":"qa-1cdbee3dd48f","displayName":"QA 1cdbee3dd48f","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.877470294Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b014586b-3d7b-48c5-86fb-cff9e59b91f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b014586b-3d7b-48c5-86fb-cff9e59b91f7
Content-Type: application/json

--- request body ---
{"handle":"qa-79a242fb977b","displayName":"QA 79a242fb977b","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b014586b-3d7b-48c5-86fb-cff9e59b91f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-79a242fb977b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cc9cf8b-23dc-4834-865f-17f6684a550f","handle":"qa-79a242fb977b","displayName":"QA 79a242fb977b","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.902766713Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-abd8016e-6faa-4bdd-bf69-f94ac215e61a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abd8016e-6faa-4bdd-bf69-f94ac215e61a
Content-Type: application/json

--- request body ---
{"handle":"qa-c46b26e0d579","displayName":"QA c46b26e0d579","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-abd8016e-6faa-4bdd-bf69-f94ac215e61a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-c46b26e0d579
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dcedd942-0d18-495b-8599-0237d175f945","handle":"qa-c46b26e0d579","displayName":"QA c46b26e0d579","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.925933004Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6c4a2234-1514-4ac4-8a1e-025d1864e55a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c4a2234-1514-4ac4-8a1e-025d1864e55a
Content-Type: application/json

--- request body ---
{"handle":"qa-1cdbee3dd48f","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c4a2234-1514-4ac4-8a1e-025d1864e55a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_843274b1-4ac8-4ae5-8766-aef3ac3bb932"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-62f155c2-d438-476d-b5fc-0106b6524e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62f155c2-d438-476d-b5fc-0106b6524e25
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-79a242fb977b","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-62f155c2-d438-476d-b5fc-0106b6524e25
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
Location: /v1/conversations/cnv_9fc07664-95e2-447f-9f92-3ef8cd02089a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9fc07664-95e2-447f-9f92-3ef8cd02089a","subject":"Error contract","status":"open","region":"eu","participants":["qa-1cdbee3dd48f","qa-79a242fb977b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.979170531Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7878e897-97e9-41b8-a4ee-5ff469006c85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7878e897-97e9-41b8-a4ee-5ff469006c85
Content-Type: application/json

--- request body ---
{"handle":"qa-c46b26e0d579","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7878e897-97e9-41b8-a4ee-5ff469006c85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dcedd942-0d18-495b-8599-0237d175f945"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9fc07664-95e2-447f-9f92-3ef8cd02089a
correlation: qa-96f4960a-8a41-44dc-b2a9-d59a7d84bcf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f4960a-8a41-44dc-b2a9-d59a7d84bcf8
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96f4960a-8a41-44dc-b2a9-d59a7d84bcf8
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9fc07664-95e2-447f-9f92-3ef8cd02089a","correlationId":"qa-96f4960a-8a41-44dc-b2a9-d59a7d84bcf8"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ce41aab-6ee4-482f-9561-5ca18ce256fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ce41aab-6ee4-482f-9561-5ca18ce256fc
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ce41aab-6ee4-482f-9561-5ca18ce256fc
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
correlation: qa-183457b5-6a58-4550-9c31-89ee8cd271e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-183457b5-6a58-4550-9c31-89ee8cd271e6
Content-Type: application/json

--- request body ---
{"handle":"qa-c46b26e0d579","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-183457b5-6a58-4550-9c31-89ee8cd271e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-183457b5-6a58-4550-9c31-89ee8cd271e6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-13b9d1f5-efc8-4328-9844-2ce1ca3eecf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b9d1f5-efc8-4328-9844-2ce1ca3eecf9
Content-Type: application/json

--- request body ---
{"handle":"qa-79a242fb977b","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-13b9d1f5-efc8-4328-9844-2ce1ca3eecf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cc9cf8b-23dc-4834-865f-17f6684a550f"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a668e6aa-4466-4dd4-a82c-2604894abee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a668e6aa-4466-4dd4-a82c-2604894abee5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a668e6aa-4466-4dd4-a82c-2604894abee5
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-40d41226-6564-4f3c-8bdd-570a149cb340

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40d41226-6564-4f3c-8bdd-570a149cb340
Content-Type: application/json

--- request body ---
{"handle":"qa-79a242fb977b","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40d41226-6564-4f3c-8bdd-570a149cb340
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40d41226-6564-4f3c-8bdd-570a149cb340"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f22813a-c123-48a7-8fbe-7b4dc26dea26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f22813a-c123-48a7-8fbe-7b4dc26dea26
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f22813a-c123-48a7-8fbe-7b4dc26dea26
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-33237937-73b5-4a59-977a-4b29ef3485a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33237937-73b5-4a59-977a-4b29ef3485a9
Content-Type: application/json

--- request body ---
{"handle":"qa-1cdbee3dd48f","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33237937-73b5-4a59-977a-4b29ef3485a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33237937-73b5-4a59-977a-4b29ef3485a9"}
```
