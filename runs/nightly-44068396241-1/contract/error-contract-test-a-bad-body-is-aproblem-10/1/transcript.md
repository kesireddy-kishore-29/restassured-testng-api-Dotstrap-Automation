# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-de245b5a-8404-4564-9ab9-5e60fde5b50a` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-8ecb2c11-1691-4da0-aa18-886cd31989f5` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-edcc3684-24a9-471e-bbcf-ee084bd34503` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-84183946-4d32-4461-8e93-cb697fc98eba` |
| 5 | `POST /v1/conversations` | 415 | 9 | `qa-e19f9144-1e3b-4ac8-97ec-d091040b830d` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-5609ed93-2780-48e8-ba11-ae9a184afaf2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-04c41a07-caff-458a-a555-2f1ed0bbe3db` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-b433f446-8837-4aba-898e-fb53e8897807` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ab66d952-59a3-48c0-b543-b2e912dda32a` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-07c37e26-681a-484a-bea1-dd910d099827` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-de245b5a-8404-4564-9ab9-5e60fde5b50a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de245b5a-8404-4564-9ab9-5e60fde5b50a
Content-Type: application/json

--- request body ---
{"handle":"qa-848c2f579b0b","displayName":"QA 848c2f579b0b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-de245b5a-8404-4564-9ab9-5e60fde5b50a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-848c2f579b0b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de043933-8956-46fa-ad95-3d213d2ed445","handle":"qa-848c2f579b0b","displayName":"QA 848c2f579b0b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.362947188Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ecb2c11-1691-4da0-aa18-886cd31989f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ecb2c11-1691-4da0-aa18-886cd31989f5
Content-Type: application/json

--- request body ---
{"handle":"qa-edf332b0e570","displayName":"QA edf332b0e570","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ecb2c11-1691-4da0-aa18-886cd31989f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-edf332b0e570
X-Served-Region: eu
Content-Length: 181

{"id":"acc_423895c8-d9f4-4db6-940d-bf1cc59753b2","handle":"qa-edf332b0e570","displayName":"QA edf332b0e570","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.411015786Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-edcc3684-24a9-471e-bbcf-ee084bd34503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edcc3684-24a9-471e-bbcf-ee084bd34503
Content-Type: application/json

--- request body ---
{"handle":"qa-848c2f579b0b","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-edcc3684-24a9-471e-bbcf-ee084bd34503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de043933-8956-46fa-ad95-3d213d2ed445"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-84183946-4d32-4461-8e93-cb697fc98eba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84183946-4d32-4461-8e93-cb697fc98eba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-edf332b0e570","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-84183946-4d32-4461-8e93-cb697fc98eba
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
Location: /v1/conversations/cnv_75c7417f-35a8-4c17-999c-f7f154d6525e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_75c7417f-35a8-4c17-999c-f7f154d6525e","subject":"Error contract","status":"open","region":"eu","participants":["qa-848c2f579b0b","qa-edf332b0e570"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.459060480Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e19f9144-1e3b-4ac8-97ec-d091040b830d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e19f9144-1e3b-4ac8-97ec-d091040b830d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e19f9144-1e3b-4ac8-97ec-d091040b830d
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-e19f9144-1e3b-4ac8-97ec-d091040b830d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5609ed93-2780-48e8-ba11-ae9a184afaf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5609ed93-2780-48e8-ba11-ae9a184afaf2
Content-Type: application/json

--- request body ---
{"handle":"qa-edf332b0e570","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-5609ed93-2780-48e8-ba11-ae9a184afaf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_423895c8-d9f4-4db6-940d-bf1cc59753b2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04c41a07-caff-458a-a555-2f1ed0bbe3db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c41a07-caff-458a-a555-2f1ed0bbe3db
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04c41a07-caff-458a-a555-2f1ed0bbe3db
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
correlation: qa-b433f446-8837-4aba-898e-fb53e8897807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b433f446-8837-4aba-898e-fb53e8897807
Content-Type: application/json

--- request body ---
{"handle":"qa-edf332b0e570","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b433f446-8837-4aba-898e-fb53e8897807
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b433f446-8837-4aba-898e-fb53e8897807"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab66d952-59a3-48c0-b543-b2e912dda32a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab66d952-59a3-48c0-b543-b2e912dda32a
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab66d952-59a3-48c0-b543-b2e912dda32a
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
correlation: qa-07c37e26-681a-484a-bea1-dd910d099827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07c37e26-681a-484a-bea1-dd910d099827
Content-Type: application/json

--- request body ---
{"handle":"qa-848c2f579b0b","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07c37e26-681a-484a-bea1-dd910d099827
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07c37e26-681a-484a-bea1-dd910d099827"}
```
