# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-9e6c9e42-81c7-42cb-b9c2-d6472e490141` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-9d614f02-7690-4fa5-919c-8cd8b84984a7` |
| 3 | `POST /v1/auth/token` | 200 | 73 | `qa-0259a51c-2a3e-4115-a8c8-00be82e8b4ba` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-77f6164b-029c-46f7-bf63-6521dcb289bf` |
| 5 | `POST /v1/accounts` | 415 | 31 | `qa-d6cdb5b2-9adc-4dda-bc97-58d90c410488` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-1692e3d1-8f81-4312-a494-ee127b4ba7d7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-29f7d182-30dc-4a54-a50a-cd601df522bf` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-4a0ee164-e7a6-43e9-ab3f-7b52bf9aeb89` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-26700857-afb9-421f-a504-238bac314c44` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-42b52e1c-8d45-404c-924e-77119405c933` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e6c9e42-81c7-42cb-b9c2-d6472e490141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e6c9e42-81c7-42cb-b9c2-d6472e490141
Content-Type: application/json

--- request body ---
{"handle":"qa-dbf893b55748","displayName":"QA dbf893b55748","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e6c9e42-81c7-42cb-b9c2-d6472e490141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Location: /v1/accounts/qa-dbf893b55748
X-Served-Region: eu
Content-Length: 181

{"id":"acc_624531cf-9161-4a85-abdb-32c6527412ff","handle":"qa-dbf893b55748","displayName":"QA dbf893b55748","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.166342492Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d614f02-7690-4fa5-919c-8cd8b84984a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d614f02-7690-4fa5-919c-8cd8b84984a7
Content-Type: application/json

--- request body ---
{"handle":"qa-5918bd6227a3","displayName":"QA 5918bd6227a3","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d614f02-7690-4fa5-919c-8cd8b84984a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-5918bd6227a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4ff3b3d-71f4-4e20-ad39-c19f66a42268","handle":"qa-5918bd6227a3","displayName":"QA 5918bd6227a3","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.257090699Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0259a51c-2a3e-4115-a8c8-00be82e8b4ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0259a51c-2a3e-4115-a8c8-00be82e8b4ba
Content-Type: application/json

--- request body ---
{"handle":"qa-dbf893b55748","password":"****"}

--- response: 200 in 73 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0259a51c-2a3e-4115-a8c8-00be82e8b4ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_624531cf-9161-4a85-abdb-32c6527412ff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-77f6164b-029c-46f7-bf63-6521dcb289bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77f6164b-029c-46f7-bf63-6521dcb289bf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5918bd6227a3","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-77f6164b-029c-46f7-bf63-6521dcb289bf
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
Location: /v1/conversations/cnv_67787e8f-2ada-40c3-955c-a7f47dc7dae5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_67787e8f-2ada-40c3-955c-a7f47dc7dae5","subject":"Error contract","status":"open","region":"eu","participants":["qa-dbf893b55748","qa-5918bd6227a3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.400747634Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-d6cdb5b2-9adc-4dda-bc97-58d90c410488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6cdb5b2-9adc-4dda-bc97-58d90c410488
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6cdb5b2-9adc-4dda-bc97-58d90c410488
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-d6cdb5b2-9adc-4dda-bc97-58d90c410488"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1692e3d1-8f81-4312-a494-ee127b4ba7d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1692e3d1-8f81-4312-a494-ee127b4ba7d7
Content-Type: application/json

--- request body ---
{"handle":"qa-5918bd6227a3","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1692e3d1-8f81-4312-a494-ee127b4ba7d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4ff3b3d-71f4-4e20-ad39-c19f66a42268"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29f7d182-30dc-4a54-a50a-cd601df522bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f7d182-30dc-4a54-a50a-cd601df522bf
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29f7d182-30dc-4a54-a50a-cd601df522bf
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
correlation: qa-4a0ee164-e7a6-43e9-ab3f-7b52bf9aeb89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a0ee164-e7a6-43e9-ab3f-7b52bf9aeb89
Content-Type: application/json

--- request body ---
{"handle":"qa-5918bd6227a3","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a0ee164-e7a6-43e9-ab3f-7b52bf9aeb89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a0ee164-e7a6-43e9-ab3f-7b52bf9aeb89"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26700857-afb9-421f-a504-238bac314c44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26700857-afb9-421f-a504-238bac314c44
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26700857-afb9-421f-a504-238bac314c44
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-42b52e1c-8d45-404c-924e-77119405c933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42b52e1c-8d45-404c-924e-77119405c933
Content-Type: application/json

--- request body ---
{"handle":"qa-dbf893b55748","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42b52e1c-8d45-404c-924e-77119405c933
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42b52e1c-8d45-404c-924e-77119405c933"}
```
