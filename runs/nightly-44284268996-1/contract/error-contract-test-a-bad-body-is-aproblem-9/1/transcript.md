# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-5276ae87-dd50-4640-90c6-8ae94f35fa4e` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-b4aa40bd-3b2d-4fa0-8f9b-21e9d9c7816f` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-390f926a-ba60-42c6-8dd3-b50a2ceb24b2` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-d889306f-b07f-4f19-9c8f-a325c9492edd` |
| 5 | `POST /v1/conversations` | 400 | 26 | `qa-5b4b43be-07f9-4916-8dbf-e6e3ae408449` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-29429734-83c3-46d9-992c-e7984e4bec9e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-2bac6445-55bb-47b1-be14-43ebe654a576` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-c21317c4-5dd9-4fd2-a3d4-de9f47b28df3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c30b0f35-83b5-4ec8-8323-e2990e26d72d` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-0762194a-f261-4358-9b51-8a48a8ecfd1f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5276ae87-dd50-4640-90c6-8ae94f35fa4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5276ae87-dd50-4640-90c6-8ae94f35fa4e
Content-Type: application/json

--- request body ---
{"handle":"qa-0d659c4f661c","displayName":"QA 0d659c4f661c","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5276ae87-dd50-4640-90c6-8ae94f35fa4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-0d659c4f661c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4bb38f7c-577c-40ba-ab4b-2b3e4c0bbec3","handle":"qa-0d659c4f661c","displayName":"QA 0d659c4f661c","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.178163172Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b4aa40bd-3b2d-4fa0-8f9b-21e9d9c7816f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4aa40bd-3b2d-4fa0-8f9b-21e9d9c7816f
Content-Type: application/json

--- request body ---
{"handle":"qa-2336b3ef3198","displayName":"QA 2336b3ef3198","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4aa40bd-3b2d-4fa0-8f9b-21e9d9c7816f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-2336b3ef3198
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d3b7627-b26c-45f4-996c-71857217b2b8","handle":"qa-2336b3ef3198","displayName":"QA 2336b3ef3198","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.225517506Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-390f926a-ba60-42c6-8dd3-b50a2ceb24b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-390f926a-ba60-42c6-8dd3-b50a2ceb24b2
Content-Type: application/json

--- request body ---
{"handle":"qa-0d659c4f661c","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-390f926a-ba60-42c6-8dd3-b50a2ceb24b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4bb38f7c-577c-40ba-ab4b-2b3e4c0bbec3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d889306f-b07f-4f19-9c8f-a325c9492edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d889306f-b07f-4f19-9c8f-a325c9492edd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2336b3ef3198","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d889306f-b07f-4f19-9c8f-a325c9492edd
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
Location: /v1/conversations/cnv_214e7cc1-7bb9-4eb6-aa6b-4003beec54fb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_214e7cc1-7bb9-4eb6-aa6b-4003beec54fb","subject":"Error contract","status":"open","region":"eu","participants":["qa-0d659c4f661c","qa-2336b3ef3198"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.300675517Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5b4b43be-07f9-4916-8dbf-e6e3ae408449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4b43be-07f9-4916-8dbf-e6e3ae408449
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b4b43be-07f9-4916-8dbf-e6e3ae408449
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-5b4b43be-07f9-4916-8dbf-e6e3ae408449"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-29429734-83c3-46d9-992c-e7984e4bec9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29429734-83c3-46d9-992c-e7984e4bec9e
Content-Type: application/json

--- request body ---
{"handle":"qa-2336b3ef3198","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-29429734-83c3-46d9-992c-e7984e4bec9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d3b7627-b26c-45f4-996c-71857217b2b8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2bac6445-55bb-47b1-be14-43ebe654a576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bac6445-55bb-47b1-be14-43ebe654a576
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2bac6445-55bb-47b1-be14-43ebe654a576
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
correlation: qa-c21317c4-5dd9-4fd2-a3d4-de9f47b28df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21317c4-5dd9-4fd2-a3d4-de9f47b28df3
Content-Type: application/json

--- request body ---
{"handle":"qa-2336b3ef3198","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c21317c4-5dd9-4fd2-a3d4-de9f47b28df3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c21317c4-5dd9-4fd2-a3d4-de9f47b28df3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c30b0f35-83b5-4ec8-8323-e2990e26d72d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c30b0f35-83b5-4ec8-8323-e2990e26d72d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c30b0f35-83b5-4ec8-8323-e2990e26d72d
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
correlation: qa-0762194a-f261-4358-9b51-8a48a8ecfd1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0762194a-f261-4358-9b51-8a48a8ecfd1f
Content-Type: application/json

--- request body ---
{"handle":"qa-0d659c4f661c","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0762194a-f261-4358-9b51-8a48a8ecfd1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0762194a-f261-4358-9b51-8a48a8ecfd1f"}
```
