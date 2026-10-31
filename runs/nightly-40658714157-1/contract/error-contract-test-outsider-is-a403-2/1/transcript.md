# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-d36d12ca-88a6-41a2-827d-17367a96158e` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-951c77e0-0682-410f-86c5-5c122ca37e5f` |
| 3 | `POST /v1/accounts` | 201 | 10 | `qa-100c19f6-33b3-49de-91ba-352042ebd916` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-b98fa7bc-95fb-485c-97ee-5b2b9e6d3fd8` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-c83317b5-de32-4f00-9bd7-9bda659cda0b` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-1d7d2225-2e86-482f-8b29-19ec5161f3ef` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 4 | `qa-2336f0f3-2119-46ef-8b51-33199bd233fb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-6d04c341-4046-4276-8032-f418e26ccad0` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-8a4002e7-2ad2-43ee-9137-7445200df89b` |
| 10 | `POST /v1/auth/token` | 200 | 23 | `qa-d610ae64-4f59-42a2-8194-e825510e5afd` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-1057482f-5c29-429b-b9c2-23b4eabfd319` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-5eaaee10-862d-44f6-b864-bb6165304715` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-db2fb8d7-f099-4590-9b81-d17e16a26579` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-4f9cf452-c6c9-4cfc-93e4-7c637ed4cabe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d36d12ca-88a6-41a2-827d-17367a96158e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d36d12ca-88a6-41a2-827d-17367a96158e
Content-Type: application/json

--- request body ---
{"handle":"qa-3c77ba4d0dde","displayName":"QA 3c77ba4d0dde","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d36d12ca-88a6-41a2-827d-17367a96158e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Location: /v1/accounts/qa-3c77ba4d0dde
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0485360-1667-486e-ac1d-479959d8b0cf","handle":"qa-3c77ba4d0dde","displayName":"QA 3c77ba4d0dde","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.531741260Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-951c77e0-0682-410f-86c5-5c122ca37e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951c77e0-0682-410f-86c5-5c122ca37e5f
Content-Type: application/json

--- request body ---
{"handle":"qa-2882e8d31c91","displayName":"QA 2882e8d31c91","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-951c77e0-0682-410f-86c5-5c122ca37e5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 10
Location: /v1/accounts/qa-2882e8d31c91
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43f2126b-d7be-4490-a878-f6dc72deb775","handle":"qa-2882e8d31c91","displayName":"QA 2882e8d31c91","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.557252922Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-100c19f6-33b3-49de-91ba-352042ebd916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-100c19f6-33b3-49de-91ba-352042ebd916
Content-Type: application/json

--- request body ---
{"handle":"qa-5cf84cd80ca5","displayName":"QA 5cf84cd80ca5","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-100c19f6-33b3-49de-91ba-352042ebd916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 10
Location: /v1/accounts/qa-5cf84cd80ca5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63fae1e5-fc88-4d7f-a855-25f6555bbc48","handle":"qa-5cf84cd80ca5","displayName":"QA 5cf84cd80ca5","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.573472241Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b98fa7bc-95fb-485c-97ee-5b2b9e6d3fd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b98fa7bc-95fb-485c-97ee-5b2b9e6d3fd8
Content-Type: application/json

--- request body ---
{"handle":"qa-3c77ba4d0dde","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b98fa7bc-95fb-485c-97ee-5b2b9e6d3fd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0485360-1667-486e-ac1d-479959d8b0cf"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c83317b5-de32-4f00-9bd7-9bda659cda0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c83317b5-de32-4f00-9bd7-9bda659cda0b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2882e8d31c91","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c83317b5-de32-4f00-9bd7-9bda659cda0b
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
Location: /v1/conversations/cnv_1a4ad16f-3caf-4b8f-b39b-39185319a3eb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a4ad16f-3caf-4b8f-b39b-39185319a3eb","subject":"Error contract","status":"open","region":"eu","participants":["qa-3c77ba4d0dde","qa-2882e8d31c91"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.612712824Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1d7d2225-2e86-482f-8b29-19ec5161f3ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7d2225-2e86-482f-8b29-19ec5161f3ef
Content-Type: application/json

--- request body ---
{"handle":"qa-5cf84cd80ca5","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7d2225-2e86-482f-8b29-19ec5161f3ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63fae1e5-fc88-4d7f-a855-25f6555bbc48"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_1a4ad16f-3caf-4b8f-b39b-39185319a3eb/messages
correlation: qa-2336f0f3-2119-46ef-8b51-33199bd233fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2336f0f3-2119-46ef-8b51-33199bd233fb
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2336f0f3-2119-46ef-8b51-33199bd233fb
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1a4ad16f-3caf-4b8f-b39b-39185319a3eb/messages","correlationId":"qa-2336f0f3-2119-46ef-8b51-33199bd233fb"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d04c341-4046-4276-8032-f418e26ccad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d04c341-4046-4276-8032-f418e26ccad0
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d04c341-4046-4276-8032-f418e26ccad0
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
correlation: qa-8a4002e7-2ad2-43ee-9137-7445200df89b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a4002e7-2ad2-43ee-9137-7445200df89b
Content-Type: application/json

--- request body ---
{"handle":"qa-5cf84cd80ca5","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a4002e7-2ad2-43ee-9137-7445200df89b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a4002e7-2ad2-43ee-9137-7445200df89b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d610ae64-4f59-42a2-8194-e825510e5afd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d610ae64-4f59-42a2-8194-e825510e5afd
Content-Type: application/json

--- request body ---
{"handle":"qa-2882e8d31c91","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d610ae64-4f59-42a2-8194-e825510e5afd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43f2126b-d7be-4490-a878-f6dc72deb775"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1057482f-5c29-429b-b9c2-23b4eabfd319

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1057482f-5c29-429b-b9c2-23b4eabfd319
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1057482f-5c29-429b-b9c2-23b4eabfd319
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
correlation: qa-5eaaee10-862d-44f6-b864-bb6165304715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eaaee10-862d-44f6-b864-bb6165304715
Content-Type: application/json

--- request body ---
{"handle":"qa-2882e8d31c91","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5eaaee10-862d-44f6-b864-bb6165304715
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5eaaee10-862d-44f6-b864-bb6165304715"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db2fb8d7-f099-4590-9b81-d17e16a26579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db2fb8d7-f099-4590-9b81-d17e16a26579
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db2fb8d7-f099-4590-9b81-d17e16a26579
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
correlation: qa-4f9cf452-c6c9-4cfc-93e4-7c637ed4cabe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f9cf452-c6c9-4cfc-93e4-7c637ed4cabe
Content-Type: application/json

--- request body ---
{"handle":"qa-3c77ba4d0dde","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f9cf452-c6c9-4cfc-93e4-7c637ed4cabe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f9cf452-c6c9-4cfc-93e4-7c637ed4cabe"}
```
