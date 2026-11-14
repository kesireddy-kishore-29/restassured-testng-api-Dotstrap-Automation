# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-bfa0fe2b-057b-468f-8bec-aff8f1bede27` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-92c510be-f314-420a-a042-8f3bc2d9c2cc` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-475409ac-f494-46c6-b2ac-4d09d6626579` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-7e699d95-3fa0-47bd-9501-898efb1fd76b` |
| 5 | `POST /v1/conversations` | 503 | 7 | `qa-6e0c7943-72e0-4ce7-97d8-50c63495cfaf` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-b77240ff-e33b-469b-9b2b-303b24244bb4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-bf0a0cda-c087-4d17-b17c-c774b9c7da4f` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-d0c79782-fb83-4d8f-ad68-03ff0303d0a2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-ee58b3f4-0b27-4a6b-bee5-70179cec148e` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-70640f65-313b-467a-8d4e-6bb617ac3901` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bfa0fe2b-057b-468f-8bec-aff8f1bede27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa0fe2b-057b-468f-8bec-aff8f1bede27
Content-Type: application/json

--- request body ---
{"handle":"qa-61886e684e40","displayName":"QA 61886e684e40","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa0fe2b-057b-468f-8bec-aff8f1bede27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 9
Location: /v1/accounts/qa-61886e684e40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a12b331-5e1e-4048-84be-19defd66bb03","handle":"qa-61886e684e40","displayName":"QA 61886e684e40","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.940112955Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92c510be-f314-420a-a042-8f3bc2d9c2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c510be-f314-420a-a042-8f3bc2d9c2cc
Content-Type: application/json

--- request body ---
{"handle":"qa-83751273ab01","displayName":"QA 83751273ab01","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-92c510be-f314-420a-a042-8f3bc2d9c2cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 9
Location: /v1/accounts/qa-83751273ab01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b021b624-227c-43bf-bec1-72ddd67819a0","handle":"qa-83751273ab01","displayName":"QA 83751273ab01","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.969072438Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-475409ac-f494-46c6-b2ac-4d09d6626579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-475409ac-f494-46c6-b2ac-4d09d6626579
Content-Type: application/json

--- request body ---
{"handle":"qa-61886e684e40","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-475409ac-f494-46c6-b2ac-4d09d6626579
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a12b331-5e1e-4048-84be-19defd66bb03"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7e699d95-3fa0-47bd-9501-898efb1fd76b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e699d95-3fa0-47bd-9501-898efb1fd76b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-83751273ab01","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e699d95-3fa0-47bd-9501-898efb1fd76b
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
Location: /v1/conversations/cnv_2487873e-699e-4520-9f19-22cdc49814b7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2487873e-699e-4520-9f19-22cdc49814b7","subject":"Error contract","status":"open","region":"eu","participants":["qa-61886e684e40","qa-83751273ab01"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.020858766Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6e0c7943-72e0-4ce7-97d8-50c63495cfaf

--- request headers ---
Accept: application/json
X-Fault-Key: 233c5119-689c-4705-99c3-392161e78ac3
X-Fault: unavailable-once
X-Correlation-Id: qa-6e0c7943-72e0-4ce7-97d8-50c63495cfaf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-61886e684e40","subject":"Probe","message":"Hi"}

--- response: 503 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e0c7943-72e0-4ce7-97d8-50c63495cfaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-6e0c7943-72e0-4ce7-97d8-50c63495cfaf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b77240ff-e33b-469b-9b2b-303b24244bb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b77240ff-e33b-469b-9b2b-303b24244bb4
Content-Type: application/json

--- request body ---
{"handle":"qa-83751273ab01","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b77240ff-e33b-469b-9b2b-303b24244bb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b021b624-227c-43bf-bec1-72ddd67819a0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf0a0cda-c087-4d17-b17c-c774b9c7da4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0a0cda-c087-4d17-b17c-c774b9c7da4f
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf0a0cda-c087-4d17-b17c-c774b9c7da4f
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
correlation: qa-d0c79782-fb83-4d8f-ad68-03ff0303d0a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c79782-fb83-4d8f-ad68-03ff0303d0a2
Content-Type: application/json

--- request body ---
{"handle":"qa-83751273ab01","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0c79782-fb83-4d8f-ad68-03ff0303d0a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0c79782-fb83-4d8f-ad68-03ff0303d0a2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee58b3f4-0b27-4a6b-bee5-70179cec148e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee58b3f4-0b27-4a6b-bee5-70179cec148e
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee58b3f4-0b27-4a6b-bee5-70179cec148e
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
correlation: qa-70640f65-313b-467a-8d4e-6bb617ac3901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70640f65-313b-467a-8d4e-6bb617ac3901
Content-Type: application/json

--- request body ---
{"handle":"qa-61886e684e40","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70640f65-313b-467a-8d4e-6bb617ac3901
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70640f65-313b-467a-8d4e-6bb617ac3901"}
```
