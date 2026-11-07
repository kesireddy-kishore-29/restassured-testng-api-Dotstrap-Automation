# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-1dc75005-0aba-46ed-a057-2d38af8d6fed` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-50b7f13a-91d3-4a57-8049-32194addb3af` |
| 3 | `POST /v1/auth/token` | 200 | 82 | `qa-a4967e98-6577-439e-8132-e927aadfb967` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-ca3e43fd-b879-4571-8dfd-fdc51b1c7e47` |
| 5 | `POST /v1/credits/purchases` | 400 | 13 | `qa-dc5fbe1d-5135-46ef-a183-35ed3d4420fb` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-2a5a1261-4a07-408c-8f1b-398289aa161a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6034e276-cb6b-4637-9f10-7f31fd8cb06e` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-4cd4610a-d771-46cd-b1bc-b995c4f92703` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-52e8449d-61f5-45df-9dc9-f5038b9937e5` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-03aa32ee-03f3-484a-9c19-b49c65af247e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1dc75005-0aba-46ed-a057-2d38af8d6fed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dc75005-0aba-46ed-a057-2d38af8d6fed
Content-Type: application/json

--- request body ---
{"handle":"qa-0f49073261a5","displayName":"QA 0f49073261a5","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dc75005-0aba-46ed-a057-2d38af8d6fed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Location: /v1/accounts/qa-0f49073261a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e774879b-0ecf-42b5-a00c-5da1c9170102","handle":"qa-0f49073261a5","displayName":"QA 0f49073261a5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.710245456Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50b7f13a-91d3-4a57-8049-32194addb3af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50b7f13a-91d3-4a57-8049-32194addb3af
Content-Type: application/json

--- request body ---
{"handle":"qa-e317f5959959","displayName":"QA e317f5959959","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-50b7f13a-91d3-4a57-8049-32194addb3af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Location: /v1/accounts/qa-e317f5959959
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc39f377-be9d-4a2f-bde4-f7e00cd8d968","handle":"qa-e317f5959959","displayName":"QA e317f5959959","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.769709704Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a4967e98-6577-439e-8132-e927aadfb967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4967e98-6577-439e-8132-e927aadfb967
Content-Type: application/json

--- request body ---
{"handle":"qa-0f49073261a5","password":"****"}

--- response: 200 in 82 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4967e98-6577-439e-8132-e927aadfb967
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e774879b-0ecf-42b5-a00c-5da1c9170102"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ca3e43fd-b879-4571-8dfd-fdc51b1c7e47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca3e43fd-b879-4571-8dfd-fdc51b1c7e47
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e317f5959959","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca3e43fd-b879-4571-8dfd-fdc51b1c7e47
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
Location: /v1/conversations/cnv_a0a09d9d-d669-4f73-bfb1-d611db71c771
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a0a09d9d-d669-4f73-bfb1-d611db71c771","subject":"Error contract","status":"open","region":"eu","participants":["qa-0f49073261a5","qa-e317f5959959"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.906646312Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dc5fbe1d-5135-46ef-a183-35ed3d4420fb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-139753d8ed7d462d82664682b534653b
X-Correlation-Id: qa-dc5fbe1d-5135-46ef-a183-35ed3d4420fb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc5fbe1d-5135-46ef-a183-35ed3d4420fb
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-dc5fbe1d-5135-46ef-a183-35ed3d4420fb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2a5a1261-4a07-408c-8f1b-398289aa161a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a5a1261-4a07-408c-8f1b-398289aa161a
Content-Type: application/json

--- request body ---
{"handle":"qa-e317f5959959","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a5a1261-4a07-408c-8f1b-398289aa161a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc39f377-be9d-4a2f-bde4-f7e00cd8d968"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6034e276-cb6b-4637-9f10-7f31fd8cb06e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6034e276-cb6b-4637-9f10-7f31fd8cb06e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6034e276-cb6b-4637-9f10-7f31fd8cb06e
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
correlation: qa-4cd4610a-d771-46cd-b1bc-b995c4f92703

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cd4610a-d771-46cd-b1bc-b995c4f92703
Content-Type: application/json

--- request body ---
{"handle":"qa-e317f5959959","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cd4610a-d771-46cd-b1bc-b995c4f92703
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4cd4610a-d771-46cd-b1bc-b995c4f92703"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52e8449d-61f5-45df-9dc9-f5038b9937e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52e8449d-61f5-45df-9dc9-f5038b9937e5
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52e8449d-61f5-45df-9dc9-f5038b9937e5
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
correlation: qa-03aa32ee-03f3-484a-9c19-b49c65af247e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03aa32ee-03f3-484a-9c19-b49c65af247e
Content-Type: application/json

--- request body ---
{"handle":"qa-0f49073261a5","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03aa32ee-03f3-484a-9c19-b49c65af247e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03aa32ee-03f3-484a-9c19-b49c65af247e"}
```
