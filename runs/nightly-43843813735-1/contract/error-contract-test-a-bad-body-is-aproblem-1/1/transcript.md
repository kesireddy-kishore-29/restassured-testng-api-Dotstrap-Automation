# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-a846dcee-d4ca-4f32-b053-6f4baec97e15` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-95600a7f-6e5c-49dc-889e-1e8839c8ace1` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-bfc6f5e7-626b-4f24-a523-b9d2485b72d6` |
| 4 | `POST /v1/conversations` | 201 | 40 | `qa-246f8481-3d97-4592-a4f0-dab1dd9eb23f` |
| 5 | `POST /v1/auth/token` | 415 | 30 | `qa-01623e9e-81bb-4c7e-a8df-5d3af1d5120b` |
| 6 | `POST /v1/auth/token` | 200 | 68 | `qa-59ed502b-115a-4753-8faf-d620b30479a6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-069f0f59-a167-4cf1-9553-e0d8c2184ba8` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-00f8175a-6e17-4ad8-ac9d-73d43a421b22` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-81e960e7-aea4-47f5-80ad-1d66e8101c61` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-647b6abb-824b-4fac-b2df-3bc98f93605b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a846dcee-d4ca-4f32-b053-6f4baec97e15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a846dcee-d4ca-4f32-b053-6f4baec97e15
Content-Type: application/json

--- request body ---
{"handle":"qa-be20bc1a557a","displayName":"QA be20bc1a557a","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a846dcee-d4ca-4f32-b053-6f4baec97e15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-be20bc1a557a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a296628f-1775-4f57-a0d9-0345d8316c56","handle":"qa-be20bc1a557a","displayName":"QA be20bc1a557a","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.872429880Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-95600a7f-6e5c-49dc-889e-1e8839c8ace1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95600a7f-6e5c-49dc-889e-1e8839c8ace1
Content-Type: application/json

--- request body ---
{"handle":"qa-818d3342e0fc","displayName":"QA 818d3342e0fc","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-95600a7f-6e5c-49dc-889e-1e8839c8ace1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-818d3342e0fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_09d6d1c7-3bc4-4143-bdb2-7fabfd7a591c","handle":"qa-818d3342e0fc","displayName":"QA 818d3342e0fc","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.905506755Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bfc6f5e7-626b-4f24-a523-b9d2485b72d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfc6f5e7-626b-4f24-a523-b9d2485b72d6
Content-Type: application/json

--- request body ---
{"handle":"qa-be20bc1a557a","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfc6f5e7-626b-4f24-a523-b9d2485b72d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a296628f-1775-4f57-a0d9-0345d8316c56"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-246f8481-3d97-4592-a4f0-dab1dd9eb23f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-246f8481-3d97-4592-a4f0-dab1dd9eb23f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-818d3342e0fc","subject":"Error contract","message":"Hi"}

--- response: 201 in 40 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-246f8481-3d97-4592-a4f0-dab1dd9eb23f
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
Location: /v1/conversations/cnv_e118cdda-97f8-49be-b31a-afa4f1237312
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e118cdda-97f8-49be-b31a-afa4f1237312","subject":"Error contract","status":"open","region":"eu","participants":["qa-be20bc1a557a","qa-818d3342e0fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.024390134Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-01623e9e-81bb-4c7e-a8df-5d3af1d5120b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01623e9e-81bb-4c7e-a8df-5d3af1d5120b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01623e9e-81bb-4c7e-a8df-5d3af1d5120b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-01623e9e-81bb-4c7e-a8df-5d3af1d5120b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-59ed502b-115a-4753-8faf-d620b30479a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59ed502b-115a-4753-8faf-d620b30479a6
Content-Type: application/json

--- request body ---
{"handle":"qa-818d3342e0fc","password":"****"}

--- response: 200 in 68 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-59ed502b-115a-4753-8faf-d620b30479a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_09d6d1c7-3bc4-4143-bdb2-7fabfd7a591c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-069f0f59-a167-4cf1-9553-e0d8c2184ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-069f0f59-a167-4cf1-9553-e0d8c2184ba8
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-069f0f59-a167-4cf1-9553-e0d8c2184ba8
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
correlation: qa-00f8175a-6e17-4ad8-ac9d-73d43a421b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00f8175a-6e17-4ad8-ac9d-73d43a421b22
Content-Type: application/json

--- request body ---
{"handle":"qa-818d3342e0fc","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00f8175a-6e17-4ad8-ac9d-73d43a421b22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-00f8175a-6e17-4ad8-ac9d-73d43a421b22"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81e960e7-aea4-47f5-80ad-1d66e8101c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e960e7-aea4-47f5-80ad-1d66e8101c61
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81e960e7-aea4-47f5-80ad-1d66e8101c61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-647b6abb-824b-4fac-b2df-3bc98f93605b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-647b6abb-824b-4fac-b2df-3bc98f93605b
Content-Type: application/json

--- request body ---
{"handle":"qa-be20bc1a557a","password":"****"}

--- response: 401 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-647b6abb-824b-4fac-b2df-3bc98f93605b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-647b6abb-824b-4fac-b2df-3bc98f93605b"}
```
