# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-b7c329ab-9414-4340-97af-b794157e4210` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-aeca61da-3c94-4d94-a6d3-af6b2d34a302` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-a55769d8-e4e6-41c3-acdc-14e1fd44d1b3` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-8b3deffc-9e66-4506-8ead-4a376f27ce05` |
| 5 | `GET /v1/conversations` | 503 | 17 | `qa-f33cd927-e811-4c29-a7d5-6b59c0cdf828` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-d6caa415-8f07-4a4b-8a82-6be2185ef7ee` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-8e1dc9c5-11f6-4c54-95cb-4805df629a0e` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-06f6e03d-8174-407d-b5e9-842f4e6666c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-89587376-5828-4c4a-bd05-cfec33fcac15` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-b988f4ae-6e71-4015-97e9-184e7f968e3b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7c329ab-9414-4340-97af-b794157e4210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7c329ab-9414-4340-97af-b794157e4210
Content-Type: application/json

--- request body ---
{"handle":"qa-1803aef3fb84","displayName":"QA 1803aef3fb84","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7c329ab-9414-4340-97af-b794157e4210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 7
Location: /v1/accounts/qa-1803aef3fb84
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf273b54-3b8e-430b-879a-8e0a45365d03","handle":"qa-1803aef3fb84","displayName":"QA 1803aef3fb84","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.226181553Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aeca61da-3c94-4d94-a6d3-af6b2d34a302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeca61da-3c94-4d94-a6d3-af6b2d34a302
Content-Type: application/json

--- request body ---
{"handle":"qa-62d8b6d65d7e","displayName":"QA 62d8b6d65d7e","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeca61da-3c94-4d94-a6d3-af6b2d34a302
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
Location: /v1/accounts/qa-62d8b6d65d7e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02b43fd1-9d49-4da1-ad76-c237accfbf5e","handle":"qa-62d8b6d65d7e","displayName":"QA 62d8b6d65d7e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.260181784Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a55769d8-e4e6-41c3-acdc-14e1fd44d1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55769d8-e4e6-41c3-acdc-14e1fd44d1b3
Content-Type: application/json

--- request body ---
{"handle":"qa-1803aef3fb84","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a55769d8-e4e6-41c3-acdc-14e1fd44d1b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf273b54-3b8e-430b-879a-8e0a45365d03"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8b3deffc-9e66-4506-8ead-4a376f27ce05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b3deffc-9e66-4506-8ead-4a376f27ce05
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-62d8b6d65d7e","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b3deffc-9e66-4506-8ead-4a376f27ce05
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
Location: /v1/conversations/cnv_f397941d-c19f-4f1e-8d8e-95c937d2be37
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f397941d-c19f-4f1e-8d8e-95c937d2be37","subject":"Error contract","status":"open","region":"eu","participants":["qa-1803aef3fb84","qa-62d8b6d65d7e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.339995869Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-f33cd927-e811-4c29-a7d5-6b59c0cdf828

--- request headers ---
Accept: application/json
X-Fault-Key: bd40a325-70b8-4365-bfdf-514750283bc6
X-Fault: unavailable-once
X-Correlation-Id: qa-f33cd927-e811-4c29-a7d5-6b59c0cdf828
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f33cd927-e811-4c29-a7d5-6b59c0cdf828
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-f33cd927-e811-4c29-a7d5-6b59c0cdf828"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d6caa415-8f07-4a4b-8a82-6be2185ef7ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6caa415-8f07-4a4b-8a82-6be2185ef7ee
Content-Type: application/json

--- request body ---
{"handle":"qa-62d8b6d65d7e","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6caa415-8f07-4a4b-8a82-6be2185ef7ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02b43fd1-9d49-4da1-ad76-c237accfbf5e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e1dc9c5-11f6-4c54-95cb-4805df629a0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1dc9c5-11f6-4c54-95cb-4805df629a0e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e1dc9c5-11f6-4c54-95cb-4805df629a0e
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
correlation: qa-06f6e03d-8174-407d-b5e9-842f4e6666c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06f6e03d-8174-407d-b5e9-842f4e6666c5
Content-Type: application/json

--- request body ---
{"handle":"qa-62d8b6d65d7e","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06f6e03d-8174-407d-b5e9-842f4e6666c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06f6e03d-8174-407d-b5e9-842f4e6666c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89587376-5828-4c4a-bd05-cfec33fcac15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89587376-5828-4c4a-bd05-cfec33fcac15
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89587376-5828-4c4a-bd05-cfec33fcac15
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
correlation: qa-b988f4ae-6e71-4015-97e9-184e7f968e3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b988f4ae-6e71-4015-97e9-184e7f968e3b
Content-Type: application/json

--- request body ---
{"handle":"qa-1803aef3fb84","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b988f4ae-6e71-4015-97e9-184e7f968e3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b988f4ae-6e71-4015-97e9-184e7f968e3b"}
```
