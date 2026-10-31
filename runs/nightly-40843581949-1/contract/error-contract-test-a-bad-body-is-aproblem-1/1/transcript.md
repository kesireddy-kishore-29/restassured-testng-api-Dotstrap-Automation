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
| 1 | `POST /v1/accounts` | 201 | 484 | `qa-5b408fdf-99ba-4335-85f4-ecfb81f900de` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-45a65e92-b175-410b-915d-546439c55c71` |
| 3 | `POST /v1/auth/token` | 200 | 99 | `qa-6b404fc5-5164-4d77-b3b4-b357ab5f3c00` |
| 4 | `POST /v1/conversations` | 201 | 57 | `qa-0816b3ab-76bf-4aa4-bc95-bfbd8c90be14` |
| 5 | `POST /v1/auth/token` | 415 | 48 | `qa-eab7a4af-d45b-469d-bf62-9b7629ba359e` |
| 6 | `POST /v1/auth/token` | 200 | 68 | `qa-46b6df6e-aea6-43e2-a3fc-2a39f9ed2297` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-6cd1a9a2-8b3a-4ce6-a912-4c7e2bd8f6a1` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-ce9a5f76-6844-4a3f-8852-8cd0e375ebfe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-dd7fd15a-5a89-401b-b61f-8ea54c1f60c7` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-a64fd17a-2b13-4e2d-bec6-19b989c29c43` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b408fdf-99ba-4335-85f4-ecfb81f900de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b408fdf-99ba-4335-85f4-ecfb81f900de
Content-Type: application/json

--- request body ---
{"handle":"qa-c65447bc0fc6","displayName":"QA c65447bc0fc6","password":"****","region":"eu"}

--- response: 201 in 484 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b408fdf-99ba-4335-85f4-ecfb81f900de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c65447bc0fc6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0dff941-2894-4cac-85c9-e95c62982689","handle":"qa-c65447bc0fc6","displayName":"QA c65447bc0fc6","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.639417885Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-45a65e92-b175-410b-915d-546439c55c71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a65e92-b175-410b-915d-546439c55c71
Content-Type: application/json

--- request body ---
{"handle":"qa-82c90bb97fe4","displayName":"QA 82c90bb97fe4","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a65e92-b175-410b-915d-546439c55c71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-82c90bb97fe4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e94c70ea-44ba-44dc-baab-185d9abd7d36","handle":"qa-82c90bb97fe4","displayName":"QA 82c90bb97fe4","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.157702128Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6b404fc5-5164-4d77-b3b4-b357ab5f3c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b404fc5-5164-4d77-b3b4-b357ab5f3c00
Content-Type: application/json

--- request body ---
{"handle":"qa-c65447bc0fc6","password":"****"}

--- response: 200 in 99 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b404fc5-5164-4d77-b3b4-b357ab5f3c00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0dff941-2894-4cac-85c9-e95c62982689"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0816b3ab-76bf-4aa4-bc95-bfbd8c90be14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0816b3ab-76bf-4aa4-bc95-bfbd8c90be14
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-82c90bb97fe4","subject":"Error contract","message":"Hi"}

--- response: 201 in 57 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0816b3ab-76bf-4aa4-bc95-bfbd8c90be14
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
Location: /v1/conversations/cnv_11a53102-812d-43a9-9a74-7caa8d59097d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_11a53102-812d-43a9-9a74-7caa8d59097d","subject":"Error contract","status":"open","region":"eu","participants":["qa-c65447bc0fc6","qa-82c90bb97fe4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.459811575Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-eab7a4af-d45b-469d-bf62-9b7629ba359e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab7a4af-d45b-469d-bf62-9b7629ba359e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 48 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eab7a4af-d45b-469d-bf62-9b7629ba359e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-eab7a4af-d45b-469d-bf62-9b7629ba359e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46b6df6e-aea6-43e2-a3fc-2a39f9ed2297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b6df6e-aea6-43e2-a3fc-2a39f9ed2297
Content-Type: application/json

--- request body ---
{"handle":"qa-82c90bb97fe4","password":"****"}

--- response: 200 in 68 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-46b6df6e-aea6-43e2-a3fc-2a39f9ed2297
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e94c70ea-44ba-44dc-baab-185d9abd7d36"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6cd1a9a2-8b3a-4ce6-a912-4c7e2bd8f6a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd1a9a2-8b3a-4ce6-a912-4c7e2bd8f6a1
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6cd1a9a2-8b3a-4ce6-a912-4c7e2bd8f6a1
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
correlation: qa-ce9a5f76-6844-4a3f-8852-8cd0e375ebfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce9a5f76-6844-4a3f-8852-8cd0e375ebfe
Content-Type: application/json

--- request body ---
{"handle":"qa-82c90bb97fe4","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce9a5f76-6844-4a3f-8852-8cd0e375ebfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce9a5f76-6844-4a3f-8852-8cd0e375ebfe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd7fd15a-5a89-401b-b61f-8ea54c1f60c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd7fd15a-5a89-401b-b61f-8ea54c1f60c7
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd7fd15a-5a89-401b-b61f-8ea54c1f60c7
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
correlation: qa-a64fd17a-2b13-4e2d-bec6-19b989c29c43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64fd17a-2b13-4e2d-bec6-19b989c29c43
Content-Type: application/json

--- request body ---
{"handle":"qa-c65447bc0fc6","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a64fd17a-2b13-4e2d-bec6-19b989c29c43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a64fd17a-2b13-4e2d-bec6-19b989c29c43"}
```
