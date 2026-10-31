# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-99c4c625-5fda-4316-9b54-ec53a49e3e95` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-0c3c39eb-fadc-44cb-89e1-0e006a85fb2c` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-6f3926d1-9752-41b8-b1e6-1581f3c52b88` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-f72bad6d-ea6c-44eb-95b4-30db011a5d2a` |
| 5 | `GET /v1/credits/balance` | 503 | 11 | `qa-6d5f9af3-872d-450d-9212-9205317e9c06` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-221ad0b2-43d5-4f14-898d-54ad08e8fd3d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-002ce4ea-9855-4e44-a61d-2235f76507fb` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-38182aa5-bd04-4692-acdb-48861ad68f30` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-d433d21c-66f5-4805-9a80-baef434036b5` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-bf38b6f3-ecd5-45c2-a9e1-85f5410febe1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99c4c625-5fda-4316-9b54-ec53a49e3e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99c4c625-5fda-4316-9b54-ec53a49e3e95
Content-Type: application/json

--- request body ---
{"handle":"qa-1ba4f11c3398","displayName":"QA 1ba4f11c3398","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-99c4c625-5fda-4316-9b54-ec53a49e3e95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Location: /v1/accounts/qa-1ba4f11c3398
X-Served-Region: eu
Content-Length: 181

{"id":"acc_098da532-9a13-4b7a-904d-fa38651803f8","handle":"qa-1ba4f11c3398","displayName":"QA 1ba4f11c3398","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.987756647Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0c3c39eb-fadc-44cb-89e1-0e006a85fb2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c3c39eb-fadc-44cb-89e1-0e006a85fb2c
Content-Type: application/json

--- request body ---
{"handle":"qa-2accddd69fd7","displayName":"QA 2accddd69fd7","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c3c39eb-fadc-44cb-89e1-0e006a85fb2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Location: /v1/accounts/qa-2accddd69fd7
X-Served-Region: eu
Content-Length: 178

{"id":"acc_1b47084e-8776-455c-ad5b-4e46884227e1","handle":"qa-2accddd69fd7","displayName":"QA 2accddd69fd7","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.030592Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6f3926d1-9752-41b8-b1e6-1581f3c52b88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f3926d1-9752-41b8-b1e6-1581f3c52b88
Content-Type: application/json

--- request body ---
{"handle":"qa-1ba4f11c3398","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f3926d1-9752-41b8-b1e6-1581f3c52b88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_098da532-9a13-4b7a-904d-fa38651803f8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f72bad6d-ea6c-44eb-95b4-30db011a5d2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f72bad6d-ea6c-44eb-95b4-30db011a5d2a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2accddd69fd7","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f72bad6d-ea6c-44eb-95b4-30db011a5d2a
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
Location: /v1/conversations/cnv_8d2810df-212b-451a-b482-8b90173b8ea6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8d2810df-212b-451a-b482-8b90173b8ea6","subject":"Error contract","status":"open","region":"eu","participants":["qa-1ba4f11c3398","qa-2accddd69fd7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.195323303Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-6d5f9af3-872d-450d-9212-9205317e9c06

--- request headers ---
Accept: application/json
X-Fault-Key: 9c10fb60-bc81-4ca4-b5a5-897d240ab7b8
X-Fault: unavailable-once
X-Correlation-Id: qa-6d5f9af3-872d-450d-9212-9205317e9c06
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d5f9af3-872d-450d-9212-9205317e9c06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-6d5f9af3-872d-450d-9212-9205317e9c06"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-221ad0b2-43d5-4f14-898d-54ad08e8fd3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-221ad0b2-43d5-4f14-898d-54ad08e8fd3d
Content-Type: application/json

--- request body ---
{"handle":"qa-2accddd69fd7","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-221ad0b2-43d5-4f14-898d-54ad08e8fd3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b47084e-8776-455c-ad5b-4e46884227e1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-002ce4ea-9855-4e44-a61d-2235f76507fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002ce4ea-9855-4e44-a61d-2235f76507fb
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-002ce4ea-9855-4e44-a61d-2235f76507fb
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
correlation: qa-38182aa5-bd04-4692-acdb-48861ad68f30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38182aa5-bd04-4692-acdb-48861ad68f30
Content-Type: application/json

--- request body ---
{"handle":"qa-2accddd69fd7","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38182aa5-bd04-4692-acdb-48861ad68f30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38182aa5-bd04-4692-acdb-48861ad68f30"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d433d21c-66f5-4805-9a80-baef434036b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d433d21c-66f5-4805-9a80-baef434036b5
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d433d21c-66f5-4805-9a80-baef434036b5
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
correlation: qa-bf38b6f3-ecd5-45c2-a9e1-85f5410febe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf38b6f3-ecd5-45c2-a9e1-85f5410febe1
Content-Type: application/json

--- request body ---
{"handle":"qa-1ba4f11c3398","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf38b6f3-ecd5-45c2-a9e1-85f5410febe1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf38b6f3-ecd5-45c2-a9e1-85f5410febe1"}
```
