# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-b5c7bb50-6061-455d-bea4-dbfce42dba3d` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-062c53b2-e0a0-4e84-8b21-8c5c4e402ca9` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-22307730-37b0-47e6-8384-327cba807d8d` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-3168c365-c2f6-4b1f-90c0-27872823a8ae` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 13 | `qa-112ff86a-7566-4e6f-b1c3-5c516d993ae4` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-475e9110-7590-4e3e-831f-c3db6edeb164` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a0237ca1-0784-4b54-8716-01779c65a953` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-5bd08550-692d-4b1d-9a71-e6ee50351135` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-fd69bc06-541b-49b3-a60c-e0ab6154aab8` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-f50a4d2f-306b-4a88-a631-8fa9a06be6d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5c7bb50-6061-455d-bea4-dbfce42dba3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5c7bb50-6061-455d-bea4-dbfce42dba3d
Content-Type: application/json

--- request body ---
{"handle":"qa-6f153b51f0b0","displayName":"QA 6f153b51f0b0","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5c7bb50-6061-455d-bea4-dbfce42dba3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Location: /v1/accounts/qa-6f153b51f0b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81de408f-aa15-46ec-8eb6-bcaf82b17c07","handle":"qa-6f153b51f0b0","displayName":"QA 6f153b51f0b0","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.439802800Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-062c53b2-e0a0-4e84-8b21-8c5c4e402ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-062c53b2-e0a0-4e84-8b21-8c5c4e402ca9
Content-Type: application/json

--- request body ---
{"handle":"qa-c2e9fb018170","displayName":"QA c2e9fb018170","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-062c53b2-e0a0-4e84-8b21-8c5c4e402ca9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-c2e9fb018170
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43c49714-dee2-4b59-8792-69079280cdf8","handle":"qa-c2e9fb018170","displayName":"QA c2e9fb018170","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.475749593Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-22307730-37b0-47e6-8384-327cba807d8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22307730-37b0-47e6-8384-327cba807d8d
Content-Type: application/json

--- request body ---
{"handle":"qa-6f153b51f0b0","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-22307730-37b0-47e6-8384-327cba807d8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81de408f-aa15-46ec-8eb6-bcaf82b17c07"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3168c365-c2f6-4b1f-90c0-27872823a8ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3168c365-c2f6-4b1f-90c0-27872823a8ae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2e9fb018170","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3168c365-c2f6-4b1f-90c0-27872823a8ae
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
Location: /v1/conversations/cnv_2b5debf5-cbaf-4810-8453-d2f437f9837f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2b5debf5-cbaf-4810-8453-d2f437f9837f","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f153b51f0b0","qa-c2e9fb018170"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.537459177Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2b5debf5-cbaf-4810-8453-d2f437f9837f/messages
correlation: qa-112ff86a-7566-4e6f-b1c3-5c516d993ae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112ff86a-7566-4e6f-b1c3-5c516d993ae4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-112ff86a-7566-4e6f-b1c3-5c516d993ae4
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_2b5debf5-cbaf-4810-8453-d2f437f9837f/messages","correlationId":"qa-112ff86a-7566-4e6f-b1c3-5c516d993ae4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-475e9110-7590-4e3e-831f-c3db6edeb164

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-475e9110-7590-4e3e-831f-c3db6edeb164
Content-Type: application/json

--- request body ---
{"handle":"qa-c2e9fb018170","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-475e9110-7590-4e3e-831f-c3db6edeb164
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43c49714-dee2-4b59-8792-69079280cdf8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0237ca1-0784-4b54-8716-01779c65a953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0237ca1-0784-4b54-8716-01779c65a953
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0237ca1-0784-4b54-8716-01779c65a953
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
correlation: qa-5bd08550-692d-4b1d-9a71-e6ee50351135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd08550-692d-4b1d-9a71-e6ee50351135
Content-Type: application/json

--- request body ---
{"handle":"qa-c2e9fb018170","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bd08550-692d-4b1d-9a71-e6ee50351135
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bd08550-692d-4b1d-9a71-e6ee50351135"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd69bc06-541b-49b3-a60c-e0ab6154aab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd69bc06-541b-49b3-a60c-e0ab6154aab8
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd69bc06-541b-49b3-a60c-e0ab6154aab8
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
correlation: qa-f50a4d2f-306b-4a88-a631-8fa9a06be6d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f50a4d2f-306b-4a88-a631-8fa9a06be6d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6f153b51f0b0","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f50a4d2f-306b-4a88-a631-8fa9a06be6d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f50a4d2f-306b-4a88-a631-8fa9a06be6d8"}
```
