# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-84d16c7c-ccf8-4cef-b244-c7184ffcc67e` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-1391f002-fa90-444a-9bec-9415f11c8449` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-f73e307a-21a7-47ac-9289-2a20424f1900` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-3387b867-66b8-4f6f-a644-3bbb6a487d60` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 7 | `qa-315acbab-e728-4b3c-a942-77f2c0bc8960` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-1a55ab20-75d3-4c0d-894d-6499d49f7ee6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9febd194-0292-444a-b3d2-f2209f40446b` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-7a88d449-6580-4943-bf38-9db1d42cfb96` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a94c0b07-2679-46bc-b979-cb204aec980a` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-c9306254-3dd0-4fcc-a746-f605bd23afd4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-84d16c7c-ccf8-4cef-b244-c7184ffcc67e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84d16c7c-ccf8-4cef-b244-c7184ffcc67e
Content-Type: application/json

--- request body ---
{"handle":"qa-4831ea7bbe69","displayName":"QA 4831ea7bbe69","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-84d16c7c-ccf8-4cef-b244-c7184ffcc67e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Location: /v1/accounts/qa-4831ea7bbe69
X-Served-Region: eu
Content-Length: 181

{"id":"acc_059d89a8-0977-4cb5-aa94-78be1590bbe0","handle":"qa-4831ea7bbe69","displayName":"QA 4831ea7bbe69","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.398260870Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1391f002-fa90-444a-9bec-9415f11c8449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1391f002-fa90-444a-9bec-9415f11c8449
Content-Type: application/json

--- request body ---
{"handle":"qa-bfea04b02e3d","displayName":"QA bfea04b02e3d","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1391f002-fa90-444a-9bec-9415f11c8449
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-bfea04b02e3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36d2ccb2-2f76-4b75-8231-9c719a7a0f53","handle":"qa-bfea04b02e3d","displayName":"QA bfea04b02e3d","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.448466600Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f73e307a-21a7-47ac-9289-2a20424f1900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f73e307a-21a7-47ac-9289-2a20424f1900
Content-Type: application/json

--- request body ---
{"handle":"qa-4831ea7bbe69","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f73e307a-21a7-47ac-9289-2a20424f1900
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_059d89a8-0977-4cb5-aa94-78be1590bbe0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3387b867-66b8-4f6f-a644-3bbb6a487d60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3387b867-66b8-4f6f-a644-3bbb6a487d60
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfea04b02e3d","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3387b867-66b8-4f6f-a644-3bbb6a487d60
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
Location: /v1/conversations/cnv_9cad1938-8563-41cc-96b6-1b08ae8059cb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9cad1938-8563-41cc-96b6-1b08ae8059cb","subject":"Error contract","status":"open","region":"eu","participants":["qa-4831ea7bbe69","qa-bfea04b02e3d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.522147224Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-4831ea7bbe69
correlation: qa-315acbab-e728-4b3c-a942-77f2c0bc8960

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3ae50fa9-3efb-474a-a162-ff78a70698d7
X-Correlation-Id: qa-315acbab-e728-4b3c-a942-77f2c0bc8960
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-315acbab-e728-4b3c-a942-77f2c0bc8960
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-4831ea7bbe69","correlationId":"qa-315acbab-e728-4b3c-a942-77f2c0bc8960"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1a55ab20-75d3-4c0d-894d-6499d49f7ee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a55ab20-75d3-4c0d-894d-6499d49f7ee6
Content-Type: application/json

--- request body ---
{"handle":"qa-bfea04b02e3d","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a55ab20-75d3-4c0d-894d-6499d49f7ee6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36d2ccb2-2f76-4b75-8231-9c719a7a0f53"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9febd194-0292-444a-b3d2-f2209f40446b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9febd194-0292-444a-b3d2-f2209f40446b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9febd194-0292-444a-b3d2-f2209f40446b
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
correlation: qa-7a88d449-6580-4943-bf38-9db1d42cfb96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a88d449-6580-4943-bf38-9db1d42cfb96
Content-Type: application/json

--- request body ---
{"handle":"qa-bfea04b02e3d","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a88d449-6580-4943-bf38-9db1d42cfb96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a88d449-6580-4943-bf38-9db1d42cfb96"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a94c0b07-2679-46bc-b979-cb204aec980a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a94c0b07-2679-46bc-b979-cb204aec980a
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a94c0b07-2679-46bc-b979-cb204aec980a
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
correlation: qa-c9306254-3dd0-4fcc-a746-f605bd23afd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9306254-3dd0-4fcc-a746-f605bd23afd4
Content-Type: application/json

--- request body ---
{"handle":"qa-4831ea7bbe69","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9306254-3dd0-4fcc-a746-f605bd23afd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9306254-3dd0-4fcc-a746-f605bd23afd4"}
```
