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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-50d5d90a-6b5b-476b-b71d-016c22549823` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-7342a78f-bc76-4007-8e1d-fcd0ae87dd65` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-9adbf781-079c-4605-a1cc-f3c89ee0b8f9` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-120a4d00-cc93-4c5d-8e70-0b18a2ecae4f` |
| 5 | `POST /v1/accounts` | 400 | 20 | `qa-d2928941-4881-441f-ad88-001605297ee4` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-b44bde91-295c-446f-9378-d62765b570a9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-70a2cbd5-ec87-4a13-8ad4-dcfc35a3cc99` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-6b802312-4185-42ef-983d-d6ce653ec662` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-dd259617-9be9-4927-9545-8cea3b57a800` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-dfe0637e-590c-44a5-8175-1348aec4ee8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-50d5d90a-6b5b-476b-b71d-016c22549823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d5d90a-6b5b-476b-b71d-016c22549823
Content-Type: application/json

--- request body ---
{"handle":"qa-8cbceadc9d8e","displayName":"QA 8cbceadc9d8e","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-50d5d90a-6b5b-476b-b71d-016c22549823
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-8cbceadc9d8e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d12e48ed-9e08-4a38-953d-0dc3959586cc","handle":"qa-8cbceadc9d8e","displayName":"QA 8cbceadc9d8e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.568353868Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7342a78f-bc76-4007-8e1d-fcd0ae87dd65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7342a78f-bc76-4007-8e1d-fcd0ae87dd65
Content-Type: application/json

--- request body ---
{"handle":"qa-5c0d94b62e3f","displayName":"QA 5c0d94b62e3f","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-7342a78f-bc76-4007-8e1d-fcd0ae87dd65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-5c0d94b62e3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ecc2ca9-3d68-46ef-a0c8-b49e36e7cad1","handle":"qa-5c0d94b62e3f","displayName":"QA 5c0d94b62e3f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.628977368Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9adbf781-079c-4605-a1cc-f3c89ee0b8f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9adbf781-079c-4605-a1cc-f3c89ee0b8f9
Content-Type: application/json

--- request body ---
{"handle":"qa-8cbceadc9d8e","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9adbf781-079c-4605-a1cc-f3c89ee0b8f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d12e48ed-9e08-4a38-953d-0dc3959586cc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-120a4d00-cc93-4c5d-8e70-0b18a2ecae4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-120a4d00-cc93-4c5d-8e70-0b18a2ecae4f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5c0d94b62e3f","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-120a4d00-cc93-4c5d-8e70-0b18a2ecae4f
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
Location: /v1/conversations/cnv_cdf46770-d935-4460-81ff-85ede146349e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cdf46770-d935-4460-81ff-85ede146349e","subject":"Error contract","status":"open","region":"eu","participants":["qa-8cbceadc9d8e","qa-5c0d94b62e3f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.711801265Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-d2928941-4881-441f-ad88-001605297ee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2928941-4881-441f-ad88-001605297ee4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2928941-4881-441f-ad88-001605297ee4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-d2928941-4881-441f-ad88-001605297ee4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b44bde91-295c-446f-9378-d62765b570a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b44bde91-295c-446f-9378-d62765b570a9
Content-Type: application/json

--- request body ---
{"handle":"qa-5c0d94b62e3f","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b44bde91-295c-446f-9378-d62765b570a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ecc2ca9-3d68-46ef-a0c8-b49e36e7cad1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70a2cbd5-ec87-4a13-8ad4-dcfc35a3cc99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a2cbd5-ec87-4a13-8ad4-dcfc35a3cc99
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70a2cbd5-ec87-4a13-8ad4-dcfc35a3cc99
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
correlation: qa-6b802312-4185-42ef-983d-d6ce653ec662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b802312-4185-42ef-983d-d6ce653ec662
Content-Type: application/json

--- request body ---
{"handle":"qa-5c0d94b62e3f","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b802312-4185-42ef-983d-d6ce653ec662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b802312-4185-42ef-983d-d6ce653ec662"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd259617-9be9-4927-9545-8cea3b57a800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd259617-9be9-4927-9545-8cea3b57a800
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd259617-9be9-4927-9545-8cea3b57a800
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
correlation: qa-dfe0637e-590c-44a5-8175-1348aec4ee8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe0637e-590c-44a5-8175-1348aec4ee8e
Content-Type: application/json

--- request body ---
{"handle":"qa-8cbceadc9d8e","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfe0637e-590c-44a5-8175-1348aec4ee8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dfe0637e-590c-44a5-8175-1348aec4ee8e"}
```
