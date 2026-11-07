# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-a1cebe0f-0844-46eb-b048-ce1f0407cbd2` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-47650d13-84fb-4095-8fd2-213d951fd71f` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-a7737ddc-7424-4a76-8578-45276141bab8` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-38a45b7d-db6c-4e98-ad81-39f551286031` |
| 5 | `PATCH /v1/accounts/me` | 422 | 15 | `qa-d2ee3ae1-368a-4cf8-adc6-174e7b13ce9d` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-1486e423-ab9f-4250-940f-905ed400a62a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-44e339f3-a399-4bb2-a378-1381b50d884a` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-e1aeb284-0a52-46df-8eef-81b17614439e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7b3f4dc2-6fa2-4aea-bee7-a8e0c9158227` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-fd4b0922-27ec-4f18-8468-ae8869de93e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a1cebe0f-0844-46eb-b048-ce1f0407cbd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1cebe0f-0844-46eb-b048-ce1f0407cbd2
Content-Type: application/json

--- request body ---
{"handle":"qa-4ec377c61638","displayName":"QA 4ec377c61638","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1cebe0f-0844-46eb-b048-ce1f0407cbd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 9
Location: /v1/accounts/qa-4ec377c61638
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2deb3b59-6788-4e2b-b3f6-3a2b639753c7","handle":"qa-4ec377c61638","displayName":"QA 4ec377c61638","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.736203834Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-47650d13-84fb-4095-8fd2-213d951fd71f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47650d13-84fb-4095-8fd2-213d951fd71f
Content-Type: application/json

--- request body ---
{"handle":"qa-5f770e40e63c","displayName":"QA 5f770e40e63c","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-47650d13-84fb-4095-8fd2-213d951fd71f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 9
Location: /v1/accounts/qa-5f770e40e63c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ffdc8b7-c04c-4abb-ad46-170d7b1a84e5","handle":"qa-5f770e40e63c","displayName":"QA 5f770e40e63c","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.776741673Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7737ddc-7424-4a76-8578-45276141bab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7737ddc-7424-4a76-8578-45276141bab8
Content-Type: application/json

--- request body ---
{"handle":"qa-4ec377c61638","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7737ddc-7424-4a76-8578-45276141bab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2deb3b59-6788-4e2b-b3f6-3a2b639753c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-38a45b7d-db6c-4e98-ad81-39f551286031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38a45b7d-db6c-4e98-ad81-39f551286031
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5f770e40e63c","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-38a45b7d-db6c-4e98-ad81-39f551286031
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
Location: /v1/conversations/cnv_e206b776-b508-420c-bc27-0095364aec98
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e206b776-b508-420c-bc27-0095364aec98","subject":"Error contract","status":"open","region":"eu","participants":["qa-4ec377c61638","qa-5f770e40e63c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.841550736Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d2ee3ae1-368a-4cf8-adc6-174e7b13ce9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2ee3ae1-368a-4cf8-adc6-174e7b13ce9d
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2ee3ae1-368a-4cf8-adc6-174e7b13ce9d
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-d2ee3ae1-368a-4cf8-adc6-174e7b13ce9d","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1486e423-ab9f-4250-940f-905ed400a62a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1486e423-ab9f-4250-940f-905ed400a62a
Content-Type: application/json

--- request body ---
{"handle":"qa-5f770e40e63c","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1486e423-ab9f-4250-940f-905ed400a62a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ffdc8b7-c04c-4abb-ad46-170d7b1a84e5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44e339f3-a399-4bb2-a378-1381b50d884a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44e339f3-a399-4bb2-a378-1381b50d884a
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44e339f3-a399-4bb2-a378-1381b50d884a
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
correlation: qa-e1aeb284-0a52-46df-8eef-81b17614439e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1aeb284-0a52-46df-8eef-81b17614439e
Content-Type: application/json

--- request body ---
{"handle":"qa-5f770e40e63c","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1aeb284-0a52-46df-8eef-81b17614439e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1aeb284-0a52-46df-8eef-81b17614439e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b3f4dc2-6fa2-4aea-bee7-a8e0c9158227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b3f4dc2-6fa2-4aea-bee7-a8e0c9158227
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b3f4dc2-6fa2-4aea-bee7-a8e0c9158227
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
correlation: qa-fd4b0922-27ec-4f18-8468-ae8869de93e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd4b0922-27ec-4f18-8468-ae8869de93e9
Content-Type: application/json

--- request body ---
{"handle":"qa-4ec377c61638","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd4b0922-27ec-4f18-8468-ae8869de93e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fd4b0922-27ec-4f18-8468-ae8869de93e9"}
```
