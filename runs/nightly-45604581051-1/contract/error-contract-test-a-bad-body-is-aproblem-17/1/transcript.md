# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-35d7be27-98de-47ea-b419-f8bec5889e70` |
| 2 | `POST /v1/accounts` | 201 | 5 | `qa-8a61e403-31da-46a2-bbb0-99106041f9bb` |
| 3 | `POST /v1/auth/token` | 200 | 5 | `qa-0330a841-de7e-4bb6-a514-fc8f5863623f` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-81789ce7-a6af-422b-86ab-97b545915739` |
| 5 | `POST /v1/credits/purchases` | 422 | 4 | `qa-64b8b296-c629-4db9-849a-8b449b7a91ee` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-3eda683b-c005-4509-af32-18461ad08ffc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-eed7d0a9-e380-4604-9291-c2cd288dbd87` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-df95ffa9-3704-406c-afae-728a7d6894ae` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-83f82bc9-e8ed-4d0b-8c7b-185f3b8d28f8` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-679161f3-fed1-4b6a-93aa-c87087ca82fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35d7be27-98de-47ea-b419-f8bec5889e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d7be27-98de-47ea-b419-f8bec5889e70
Content-Type: application/json

--- request body ---
{"handle":"qa-be61a2f4d43c","displayName":"QA be61a2f4d43c","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-35d7be27-98de-47ea-b419-f8bec5889e70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Location: /v1/accounts/qa-be61a2f4d43c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dddf3f6-1a22-4134-b00a-d4020d1a7174","handle":"qa-be61a2f4d43c","displayName":"QA be61a2f4d43c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.585437698Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8a61e403-31da-46a2-bbb0-99106041f9bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a61e403-31da-46a2-bbb0-99106041f9bb
Content-Type: application/json

--- request body ---
{"handle":"qa-64fafcd04cf4","displayName":"QA 64fafcd04cf4","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a61e403-31da-46a2-bbb0-99106041f9bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Location: /v1/accounts/qa-64fafcd04cf4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5ca91f0-74a2-4a14-a5e7-5db414d239c2","handle":"qa-64fafcd04cf4","displayName":"QA 64fafcd04cf4","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.596351023Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0330a841-de7e-4bb6-a514-fc8f5863623f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0330a841-de7e-4bb6-a514-fc8f5863623f
Content-Type: application/json

--- request body ---
{"handle":"qa-be61a2f4d43c","password":"****"}

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0330a841-de7e-4bb6-a514-fc8f5863623f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dddf3f6-1a22-4134-b00a-d4020d1a7174"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-81789ce7-a6af-422b-86ab-97b545915739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81789ce7-a6af-422b-86ab-97b545915739
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-64fafcd04cf4","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-81789ce7-a6af-422b-86ab-97b545915739
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
Location: /v1/conversations/cnv_218e5ed5-7a8b-4519-8410-2676cc01e415
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_218e5ed5-7a8b-4519-8410-2676cc01e415","subject":"Error contract","status":"open","region":"eu","participants":["qa-be61a2f4d43c","qa-64fafcd04cf4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.611286509Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-64b8b296-c629-4db9-849a-8b449b7a91ee

--- request headers ---
Accept: application/json
Idempotency-Key: qa-078819aacc554ba6b3818d748d388f0a
X-Correlation-Id: qa-64b8b296-c629-4db9-849a-8b449b7a91ee
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64b8b296-c629-4db9-849a-8b449b7a91ee
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-64b8b296-c629-4db9-849a-8b449b7a91ee","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3eda683b-c005-4509-af32-18461ad08ffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eda683b-c005-4509-af32-18461ad08ffc
Content-Type: application/json

--- request body ---
{"handle":"qa-64fafcd04cf4","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eda683b-c005-4509-af32-18461ad08ffc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5ca91f0-74a2-4a14-a5e7-5db414d239c2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eed7d0a9-e380-4604-9291-c2cd288dbd87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed7d0a9-e380-4604-9291-c2cd288dbd87
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eed7d0a9-e380-4604-9291-c2cd288dbd87
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
correlation: qa-df95ffa9-3704-406c-afae-728a7d6894ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df95ffa9-3704-406c-afae-728a7d6894ae
Content-Type: application/json

--- request body ---
{"handle":"qa-64fafcd04cf4","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df95ffa9-3704-406c-afae-728a7d6894ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df95ffa9-3704-406c-afae-728a7d6894ae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83f82bc9-e8ed-4d0b-8c7b-185f3b8d28f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f82bc9-e8ed-4d0b-8c7b-185f3b8d28f8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83f82bc9-e8ed-4d0b-8c7b-185f3b8d28f8
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
correlation: qa-679161f3-fed1-4b6a-93aa-c87087ca82fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-679161f3-fed1-4b6a-93aa-c87087ca82fd
Content-Type: application/json

--- request body ---
{"handle":"qa-be61a2f4d43c","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-679161f3-fed1-4b6a-93aa-c87087ca82fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-679161f3-fed1-4b6a-93aa-c87087ca82fd"}
```
