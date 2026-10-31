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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-e83d7e3c-9a66-44be-bf3c-278ef6e898a5` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-40496c5e-0f03-4753-856b-d118b65099f9` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-5015f7b2-c52f-47ab-bb12-c7254099d284` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-e0d63e19-91cb-45af-858c-145ba1f4833f` |
| 5 | `POST /v1/credits/purchases` | 422 | 12 | `qa-f979c46c-b2e0-47f4-b8cb-c350313441f2` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-201cdb8f-c7e7-44dc-b277-bf5d6f829503` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ab3cc5b0-c768-4c23-b2d9-9be52f2c3998` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-81eee385-d184-44cc-a62b-4153133e9751` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d34b1ec0-974c-4c30-a3a9-ca75330c07d2` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-6a103610-1f7c-4788-93b6-1bb87c6e226a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e83d7e3c-9a66-44be-bf3c-278ef6e898a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e83d7e3c-9a66-44be-bf3c-278ef6e898a5
Content-Type: application/json

--- request body ---
{"handle":"qa-fedbec89fa61","displayName":"QA fedbec89fa61","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e83d7e3c-9a66-44be-bf3c-278ef6e898a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Location: /v1/accounts/qa-fedbec89fa61
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cea1c699-d843-419e-9747-ad5158107b1b","handle":"qa-fedbec89fa61","displayName":"QA fedbec89fa61","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.169348176Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-40496c5e-0f03-4753-856b-d118b65099f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40496c5e-0f03-4753-856b-d118b65099f9
Content-Type: application/json

--- request body ---
{"handle":"qa-00ea46279876","displayName":"QA 00ea46279876","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-40496c5e-0f03-4753-856b-d118b65099f9
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
Location: /v1/accounts/qa-00ea46279876
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a71a714f-308e-4227-9682-b05583a09ad7","handle":"qa-00ea46279876","displayName":"QA 00ea46279876","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.186070931Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5015f7b2-c52f-47ab-bb12-c7254099d284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5015f7b2-c52f-47ab-bb12-c7254099d284
Content-Type: application/json

--- request body ---
{"handle":"qa-fedbec89fa61","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-5015f7b2-c52f-47ab-bb12-c7254099d284
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cea1c699-d843-419e-9747-ad5158107b1b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e0d63e19-91cb-45af-858c-145ba1f4833f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0d63e19-91cb-45af-858c-145ba1f4833f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-00ea46279876","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0d63e19-91cb-45af-858c-145ba1f4833f
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
Location: /v1/conversations/cnv_f100d39f-64ef-4ab0-9054-97f979523368
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f100d39f-64ef-4ab0-9054-97f979523368","subject":"Error contract","status":"open","region":"eu","participants":["qa-fedbec89fa61","qa-00ea46279876"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:27.239352566Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f979c46c-b2e0-47f4-b8cb-c350313441f2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-09348734df8f4f8d8f7284cb14168577
X-Correlation-Id: qa-f979c46c-b2e0-47f4-b8cb-c350313441f2
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f979c46c-b2e0-47f4-b8cb-c350313441f2
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-f979c46c-b2e0-47f4-b8cb-c350313441f2","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-201cdb8f-c7e7-44dc-b277-bf5d6f829503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-201cdb8f-c7e7-44dc-b277-bf5d6f829503
Content-Type: application/json

--- request body ---
{"handle":"qa-00ea46279876","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-201cdb8f-c7e7-44dc-b277-bf5d6f829503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a71a714f-308e-4227-9682-b05583a09ad7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab3cc5b0-c768-4c23-b2d9-9be52f2c3998

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab3cc5b0-c768-4c23-b2d9-9be52f2c3998
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab3cc5b0-c768-4c23-b2d9-9be52f2c3998
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
correlation: qa-81eee385-d184-44cc-a62b-4153133e9751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81eee385-d184-44cc-a62b-4153133e9751
Content-Type: application/json

--- request body ---
{"handle":"qa-00ea46279876","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81eee385-d184-44cc-a62b-4153133e9751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81eee385-d184-44cc-a62b-4153133e9751"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d34b1ec0-974c-4c30-a3a9-ca75330c07d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d34b1ec0-974c-4c30-a3a9-ca75330c07d2
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d34b1ec0-974c-4c30-a3a9-ca75330c07d2
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
correlation: qa-6a103610-1f7c-4788-93b6-1bb87c6e226a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a103610-1f7c-4788-93b6-1bb87c6e226a
Content-Type: application/json

--- request body ---
{"handle":"qa-fedbec89fa61","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a103610-1f7c-4788-93b6-1bb87c6e226a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a103610-1f7c-4788-93b6-1bb87c6e226a"}
```
