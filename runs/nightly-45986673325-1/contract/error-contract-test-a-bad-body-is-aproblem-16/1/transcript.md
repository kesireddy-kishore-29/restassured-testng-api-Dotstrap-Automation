# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-e0bd0a5f-255a-4c3d-8a84-e8b66e813bff` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-9ae938f8-1f2b-48d6-938b-21ae2a58fc81` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-6502f102-92a4-4ca4-ae49-a3580ff4632b` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-2d4f7d7e-1e8c-41ad-a055-6241c68d9497` |
| 5 | `POST /v1/credits/purchases` | 415 | 16 | `qa-48b9c3ff-fad7-4007-8c8c-b8e708cb5d46` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-b781b1cc-eaf2-4094-af42-068c8e243068` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2f7a0913-99ae-41ff-98b2-2f597753241c` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-724fc5df-d839-4c01-9870-db6ea2fbaa72` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d81a958d-1db7-4e70-87a4-861bc363671a` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-20c340af-d45e-44ef-92ab-dfe3aebb9ec2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0bd0a5f-255a-4c3d-8a84-e8b66e813bff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0bd0a5f-255a-4c3d-8a84-e8b66e813bff
Content-Type: application/json

--- request body ---
{"handle":"qa-2c343833b2a1","displayName":"QA 2c343833b2a1","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0bd0a5f-255a-4c3d-8a84-e8b66e813bff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Location: /v1/accounts/qa-2c343833b2a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e2cd748-019e-4516-b4bc-eb2a8d543b78","handle":"qa-2c343833b2a1","displayName":"QA 2c343833b2a1","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.145740822Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ae938f8-1f2b-48d6-938b-21ae2a58fc81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae938f8-1f2b-48d6-938b-21ae2a58fc81
Content-Type: application/json

--- request body ---
{"handle":"qa-3bbbce3ef00f","displayName":"QA 3bbbce3ef00f","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ae938f8-1f2b-48d6-938b-21ae2a58fc81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Location: /v1/accounts/qa-3bbbce3ef00f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95eb1cba-6fa2-4d8d-8c7e-4e5e8a085a87","handle":"qa-3bbbce3ef00f","displayName":"QA 3bbbce3ef00f","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.168766482Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6502f102-92a4-4ca4-ae49-a3580ff4632b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6502f102-92a4-4ca4-ae49-a3580ff4632b
Content-Type: application/json

--- request body ---
{"handle":"qa-2c343833b2a1","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6502f102-92a4-4ca4-ae49-a3580ff4632b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e2cd748-019e-4516-b4bc-eb2a8d543b78"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2d4f7d7e-1e8c-41ad-a055-6241c68d9497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d4f7d7e-1e8c-41ad-a055-6241c68d9497
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3bbbce3ef00f","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d4f7d7e-1e8c-41ad-a055-6241c68d9497
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
Location: /v1/conversations/cnv_5bca851f-e2bd-4d6d-8ffa-8cf70ef9edf9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5bca851f-e2bd-4d6d-8ffa-8cf70ef9edf9","subject":"Error contract","status":"open","region":"eu","participants":["qa-2c343833b2a1","qa-3bbbce3ef00f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T11:00:00.243868580Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-48b9c3ff-fad7-4007-8c8c-b8e708cb5d46

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83fd6c6c035d4cad8e631b6ff05716ea
X-Correlation-Id: qa-48b9c3ff-fad7-4007-8c8c-b8e708cb5d46
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48b9c3ff-fad7-4007-8c8c-b8e708cb5d46
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-48b9c3ff-fad7-4007-8c8c-b8e708cb5d46"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b781b1cc-eaf2-4094-af42-068c8e243068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b781b1cc-eaf2-4094-af42-068c8e243068
Content-Type: application/json

--- request body ---
{"handle":"qa-3bbbce3ef00f","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b781b1cc-eaf2-4094-af42-068c8e243068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95eb1cba-6fa2-4d8d-8c7e-4e5e8a085a87"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f7a0913-99ae-41ff-98b2-2f597753241c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f7a0913-99ae-41ff-98b2-2f597753241c
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f7a0913-99ae-41ff-98b2-2f597753241c
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
correlation: qa-724fc5df-d839-4c01-9870-db6ea2fbaa72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-724fc5df-d839-4c01-9870-db6ea2fbaa72
Content-Type: application/json

--- request body ---
{"handle":"qa-3bbbce3ef00f","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-724fc5df-d839-4c01-9870-db6ea2fbaa72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-724fc5df-d839-4c01-9870-db6ea2fbaa72"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d81a958d-1db7-4e70-87a4-861bc363671a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d81a958d-1db7-4e70-87a4-861bc363671a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d81a958d-1db7-4e70-87a4-861bc363671a
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
correlation: qa-20c340af-d45e-44ef-92ab-dfe3aebb9ec2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20c340af-d45e-44ef-92ab-dfe3aebb9ec2
Content-Type: application/json

--- request body ---
{"handle":"qa-2c343833b2a1","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20c340af-d45e-44ef-92ab-dfe3aebb9ec2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20c340af-d45e-44ef-92ab-dfe3aebb9ec2"}
```
