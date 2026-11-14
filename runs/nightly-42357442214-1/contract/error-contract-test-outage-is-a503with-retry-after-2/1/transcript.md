# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-6032230c-33f4-48d0-a2be-221191e631dd` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-54e6fd5b-a3c9-4b11-8b5c-0ea008b42548` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-698bda49-2844-4ec1-b9be-00184d13bcd6` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-905f0055-54b7-43db-a9ad-ca37d526396b` |
| 5 | `GET /v1/accounts/me` | 503 | 13 | `qa-6808ccc9-029c-454e-b14e-c23ad9ec66d8` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-7c5cb8e7-b295-4f0f-b455-ffa876ee75a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1b27ed93-ecf1-42cd-a1ad-fab3b2e7e209` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-acb6d67f-fb4e-4392-9df9-c7f970d19053` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-ff1c2ea2-da1a-47e8-818b-4bb148b344f2` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-0cfa21ba-66e4-404a-ab9e-fc631b9a18b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6032230c-33f4-48d0-a2be-221191e631dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6032230c-33f4-48d0-a2be-221191e631dd
Content-Type: application/json

--- request body ---
{"handle":"qa-853225271086","displayName":"QA 853225271086","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6032230c-33f4-48d0-a2be-221191e631dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-853225271086
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95959535-46bd-46d2-b7f3-ffe97972e30b","handle":"qa-853225271086","displayName":"QA 853225271086","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.119094964Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-54e6fd5b-a3c9-4b11-8b5c-0ea008b42548

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54e6fd5b-a3c9-4b11-8b5c-0ea008b42548
Content-Type: application/json

--- request body ---
{"handle":"qa-f0e123c17f3c","displayName":"QA f0e123c17f3c","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-54e6fd5b-a3c9-4b11-8b5c-0ea008b42548
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-f0e123c17f3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c99c3824-8679-4c66-8f19-76341401c28d","handle":"qa-f0e123c17f3c","displayName":"QA f0e123c17f3c","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.149895300Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-698bda49-2844-4ec1-b9be-00184d13bcd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-698bda49-2844-4ec1-b9be-00184d13bcd6
Content-Type: application/json

--- request body ---
{"handle":"qa-853225271086","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-698bda49-2844-4ec1-b9be-00184d13bcd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95959535-46bd-46d2-b7f3-ffe97972e30b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-905f0055-54b7-43db-a9ad-ca37d526396b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905f0055-54b7-43db-a9ad-ca37d526396b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f0e123c17f3c","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-905f0055-54b7-43db-a9ad-ca37d526396b
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
Location: /v1/conversations/cnv_043d23b0-da23-48e3-8d37-4090134c9814
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_043d23b0-da23-48e3-8d37-4090134c9814","subject":"Error contract","status":"open","region":"eu","participants":["qa-853225271086","qa-f0e123c17f3c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.218135549Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6808ccc9-029c-454e-b14e-c23ad9ec66d8

--- request headers ---
Accept: application/json
X-Fault-Key: cf785516-8425-4d69-8466-1c3d38a3525f
X-Fault: unavailable-once
X-Correlation-Id: qa-6808ccc9-029c-454e-b14e-c23ad9ec66d8
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6808ccc9-029c-454e-b14e-c23ad9ec66d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6808ccc9-029c-454e-b14e-c23ad9ec66d8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7c5cb8e7-b295-4f0f-b455-ffa876ee75a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5cb8e7-b295-4f0f-b455-ffa876ee75a2
Content-Type: application/json

--- request body ---
{"handle":"qa-f0e123c17f3c","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5cb8e7-b295-4f0f-b455-ffa876ee75a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c99c3824-8679-4c66-8f19-76341401c28d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b27ed93-ecf1-42cd-a1ad-fab3b2e7e209

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b27ed93-ecf1-42cd-a1ad-fab3b2e7e209
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b27ed93-ecf1-42cd-a1ad-fab3b2e7e209
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
correlation: qa-acb6d67f-fb4e-4392-9df9-c7f970d19053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acb6d67f-fb4e-4392-9df9-c7f970d19053
Content-Type: application/json

--- request body ---
{"handle":"qa-f0e123c17f3c","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acb6d67f-fb4e-4392-9df9-c7f970d19053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acb6d67f-fb4e-4392-9df9-c7f970d19053"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff1c2ea2-da1a-47e8-818b-4bb148b344f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1c2ea2-da1a-47e8-818b-4bb148b344f2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff1c2ea2-da1a-47e8-818b-4bb148b344f2
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
correlation: qa-0cfa21ba-66e4-404a-ab9e-fc631b9a18b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cfa21ba-66e4-404a-ab9e-fc631b9a18b9
Content-Type: application/json

--- request body ---
{"handle":"qa-853225271086","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cfa21ba-66e4-404a-ab9e-fc631b9a18b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0cfa21ba-66e4-404a-ab9e-fc631b9a18b9"}
```
