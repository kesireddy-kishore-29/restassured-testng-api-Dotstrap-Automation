# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-f334adad-2141-4045-86c7-83370f1a2089` |
| 2 | `POST /v1/accounts` | 201 | 83 | `qa-d61e67f4-5d8b-4b08-8a96-f01b53a1f50a` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-6902b462-e40b-4c8b-81b7-f7076addac95` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-1250df0c-f4c0-4230-bfee-e28f073a977d` |
| 5 | `POST /v1/accounts` | 400 | 47 | `qa-e5d58f2c-d967-474d-81ce-9d1defe12e5f` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-79c8f66f-66c5-43e6-994d-496d4a69b332` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-9ac8caf6-9812-41c7-b200-f0cb9e24b923` |
| 8 | `POST /v1/auth/token` | 401 | 37 | `qa-73e6491b-103c-4a3c-96f8-36eb88ef1572` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-82681e20-5bf9-43dd-a567-99acb324b362` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-a157b130-e45c-45f6-b595-7bea73b858b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f334adad-2141-4045-86c7-83370f1a2089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f334adad-2141-4045-86c7-83370f1a2089
Content-Type: application/json

--- request body ---
{"handle":"qa-aa932c70edd6","displayName":"QA aa932c70edd6","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f334adad-2141-4045-86c7-83370f1a2089
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-aa932c70edd6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed46b837-7d2d-4cab-889b-9ecce05ec8b7","handle":"qa-aa932c70edd6","displayName":"QA aa932c70edd6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.339673459Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d61e67f4-5d8b-4b08-8a96-f01b53a1f50a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d61e67f4-5d8b-4b08-8a96-f01b53a1f50a
Content-Type: application/json

--- request body ---
{"handle":"qa-75a7d6886a79","displayName":"QA 75a7d6886a79","password":"****","region":"eu"}

--- response: 201 in 83 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d61e67f4-5d8b-4b08-8a96-f01b53a1f50a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-75a7d6886a79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79cb4277-a356-413a-9242-5b421d77a143","handle":"qa-75a7d6886a79","displayName":"QA 75a7d6886a79","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.815126687Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6902b462-e40b-4c8b-81b7-f7076addac95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6902b462-e40b-4c8b-81b7-f7076addac95
Content-Type: application/json

--- request body ---
{"handle":"qa-aa932c70edd6","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6902b462-e40b-4c8b-81b7-f7076addac95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed46b837-7d2d-4cab-889b-9ecce05ec8b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1250df0c-f4c0-4230-bfee-e28f073a977d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1250df0c-f4c0-4230-bfee-e28f073a977d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-75a7d6886a79","subject":"Error contract","message":"Hi"}

--- response: 201 in 64 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1250df0c-f4c0-4230-bfee-e28f073a977d
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
Location: /v1/conversations/cnv_74301a3a-fcc1-4162-bc1e-85b6041db410
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74301a3a-fcc1-4162-bc1e-85b6041db410","subject":"Error contract","status":"open","region":"eu","participants":["qa-aa932c70edd6","qa-75a7d6886a79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.990871150Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e5d58f2c-d967-474d-81ce-9d1defe12e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d58f2c-d967-474d-81ce-9d1defe12e5f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 47 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5d58f2c-d967-474d-81ce-9d1defe12e5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-e5d58f2c-d967-474d-81ce-9d1defe12e5f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-79c8f66f-66c5-43e6-994d-496d4a69b332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79c8f66f-66c5-43e6-994d-496d4a69b332
Content-Type: application/json

--- request body ---
{"handle":"qa-75a7d6886a79","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-79c8f66f-66c5-43e6-994d-496d4a69b332
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79cb4277-a356-413a-9242-5b421d77a143"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ac8caf6-9812-41c7-b200-f0cb9e24b923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac8caf6-9812-41c7-b200-f0cb9e24b923
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ac8caf6-9812-41c7-b200-f0cb9e24b923
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
correlation: qa-73e6491b-103c-4a3c-96f8-36eb88ef1572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73e6491b-103c-4a3c-96f8-36eb88ef1572
Content-Type: application/json

--- request body ---
{"handle":"qa-75a7d6886a79","password":"****"}

--- response: 401 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73e6491b-103c-4a3c-96f8-36eb88ef1572
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73e6491b-103c-4a3c-96f8-36eb88ef1572"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82681e20-5bf9-43dd-a567-99acb324b362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82681e20-5bf9-43dd-a567-99acb324b362
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82681e20-5bf9-43dd-a567-99acb324b362
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
correlation: qa-a157b130-e45c-45f6-b595-7bea73b858b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a157b130-e45c-45f6-b595-7bea73b858b2
Content-Type: application/json

--- request body ---
{"handle":"qa-aa932c70edd6","password":"****"}

--- response: 401 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a157b130-e45c-45f6-b595-7bea73b858b2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a157b130-e45c-45f6-b595-7bea73b858b2"}
```
