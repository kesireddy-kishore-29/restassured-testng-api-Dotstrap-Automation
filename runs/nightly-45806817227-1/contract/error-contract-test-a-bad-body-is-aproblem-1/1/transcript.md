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
| 1 | `POST /v1/accounts` | 201 | 72 | `qa-9ea6992e-e1a2-4fff-baf1-947f522ca70a` |
| 2 | `POST /v1/accounts` | 201 | 87 | `qa-5b4b4e52-0fb8-42a7-9ce0-3b4b412dd836` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-a66f9960-c021-46e8-bdf9-02012aea8004` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-0555f53f-d9c2-4395-a886-e1e33b7651de` |
| 5 | `POST /v1/auth/token` | 415 | 53 | `qa-c0dd1bdb-c404-44bd-95cc-2b8c35a890b1` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-c591e65a-64ba-46b0-9570-3ce0d078da56` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-1132478e-3af7-429c-94ba-76fb29568e6b` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-12ccbbb9-13ea-487f-a075-733c1bd005f4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-d30885ec-ba19-4c5b-a1b0-71473eaaf01c` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-d868af10-5f16-435d-bbd6-052dcf3aa2f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ea6992e-e1a2-4fff-baf1-947f522ca70a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ea6992e-e1a2-4fff-baf1-947f522ca70a
Content-Type: application/json

--- request body ---
{"handle":"qa-399781ad4b94","displayName":"QA 399781ad4b94","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ea6992e-e1a2-4fff-baf1-947f522ca70a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-399781ad4b94
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04cb947b-8fdc-4c2e-80aa-e9b399640f33","handle":"qa-399781ad4b94","displayName":"QA 399781ad4b94","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.536125134Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5b4b4e52-0fb8-42a7-9ce0-3b4b412dd836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4b4e52-0fb8-42a7-9ce0-3b4b412dd836
Content-Type: application/json

--- request body ---
{"handle":"qa-4ab83ec9fff9","displayName":"QA 4ab83ec9fff9","password":"****","region":"eu"}

--- response: 201 in 87 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b4b4e52-0fb8-42a7-9ce0-3b4b412dd836
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-4ab83ec9fff9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8fc4e89-084e-4057-ba95-3a2ca1cd4485","handle":"qa-4ab83ec9fff9","displayName":"QA 4ab83ec9fff9","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.627377995Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a66f9960-c021-46e8-bdf9-02012aea8004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a66f9960-c021-46e8-bdf9-02012aea8004
Content-Type: application/json

--- request body ---
{"handle":"qa-399781ad4b94","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a66f9960-c021-46e8-bdf9-02012aea8004
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04cb947b-8fdc-4c2e-80aa-e9b399640f33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0555f53f-d9c2-4395-a886-e1e33b7651de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0555f53f-d9c2-4395-a886-e1e33b7651de
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4ab83ec9fff9","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0555f53f-d9c2-4395-a886-e1e33b7651de
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
Location: /v1/conversations/cnv_1dd72ee5-670d-4d92-b6df-459323f497aa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1dd72ee5-670d-4d92-b6df-459323f497aa","subject":"Error contract","status":"open","region":"eu","participants":["qa-399781ad4b94","qa-4ab83ec9fff9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.720001527Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c0dd1bdb-c404-44bd-95cc-2b8c35a890b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0dd1bdb-c404-44bd-95cc-2b8c35a890b1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 53 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0dd1bdb-c404-44bd-95cc-2b8c35a890b1
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-c0dd1bdb-c404-44bd-95cc-2b8c35a890b1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c591e65a-64ba-46b0-9570-3ce0d078da56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c591e65a-64ba-46b0-9570-3ce0d078da56
Content-Type: application/json

--- request body ---
{"handle":"qa-4ab83ec9fff9","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-c591e65a-64ba-46b0-9570-3ce0d078da56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8fc4e89-084e-4057-ba95-3a2ca1cd4485"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1132478e-3af7-429c-94ba-76fb29568e6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1132478e-3af7-429c-94ba-76fb29568e6b
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1132478e-3af7-429c-94ba-76fb29568e6b
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
correlation: qa-12ccbbb9-13ea-487f-a075-733c1bd005f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12ccbbb9-13ea-487f-a075-733c1bd005f4
Content-Type: application/json

--- request body ---
{"handle":"qa-4ab83ec9fff9","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12ccbbb9-13ea-487f-a075-733c1bd005f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12ccbbb9-13ea-487f-a075-733c1bd005f4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d30885ec-ba19-4c5b-a1b0-71473eaaf01c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d30885ec-ba19-4c5b-a1b0-71473eaaf01c
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d30885ec-ba19-4c5b-a1b0-71473eaaf01c
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
correlation: qa-d868af10-5f16-435d-bbd6-052dcf3aa2f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d868af10-5f16-435d-bbd6-052dcf3aa2f2
Content-Type: application/json

--- request body ---
{"handle":"qa-399781ad4b94","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d868af10-5f16-435d-bbd6-052dcf3aa2f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d868af10-5f16-435d-bbd6-052dcf3aa2f2"}
```
