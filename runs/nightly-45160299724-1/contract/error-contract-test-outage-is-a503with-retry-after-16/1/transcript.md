# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-e96f6b27-225d-42ae-ae59-8d23f8cc2da4` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-a905b32e-76c1-428a-820a-ad28322aabea` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-98457d05-97c7-40ed-9da6-87e2431293c2` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-52fe2727-89d9-4d01-8d13-d674ae3a7a3b` |
| 5 | `GET /v1/admin/stats` | 503 | 13 | `qa-a115d5e3-5467-47c9-989e-b577c13b5177` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-3dbda592-3bb2-4f30-bba1-9419b7822c41` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d6889672-6b55-41a7-9abe-e3dffdf1cc78` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-d698f0fb-0628-43a7-834a-bfda58a42168` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-14508f48-cb7c-4a22-8a67-d8d8ca974e61` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-fd857be2-68bc-46b3-9be1-e21f714894d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e96f6b27-225d-42ae-ae59-8d23f8cc2da4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e96f6b27-225d-42ae-ae59-8d23f8cc2da4
Content-Type: application/json

--- request body ---
{"handle":"qa-07736bf0edf3","displayName":"QA 07736bf0edf3","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e96f6b27-225d-42ae-ae59-8d23f8cc2da4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Location: /v1/accounts/qa-07736bf0edf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0825c84f-185c-49e7-907b-23793e0b5a8a","handle":"qa-07736bf0edf3","displayName":"QA 07736bf0edf3","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.106969862Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a905b32e-76c1-428a-820a-ad28322aabea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a905b32e-76c1-428a-820a-ad28322aabea
Content-Type: application/json

--- request body ---
{"handle":"qa-c15850af37f5","displayName":"QA c15850af37f5","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a905b32e-76c1-428a-820a-ad28322aabea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Location: /v1/accounts/qa-c15850af37f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6947a502-d032-49cf-8fb1-e7d38a1dbba3","handle":"qa-c15850af37f5","displayName":"QA c15850af37f5","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.123262608Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98457d05-97c7-40ed-9da6-87e2431293c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98457d05-97c7-40ed-9da6-87e2431293c2
Content-Type: application/json

--- request body ---
{"handle":"qa-07736bf0edf3","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-98457d05-97c7-40ed-9da6-87e2431293c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0825c84f-185c-49e7-907b-23793e0b5a8a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-52fe2727-89d9-4d01-8d13-d674ae3a7a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52fe2727-89d9-4d01-8d13-d674ae3a7a3b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c15850af37f5","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-52fe2727-89d9-4d01-8d13-d674ae3a7a3b
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
Location: /v1/conversations/cnv_4cfeefa8-fc22-4f4e-822f-682ef3340ffa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4cfeefa8-fc22-4f4e-822f-682ef3340ffa","subject":"Error contract","status":"open","region":"eu","participants":["qa-07736bf0edf3","qa-c15850af37f5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:00.197413372Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-a115d5e3-5467-47c9-989e-b577c13b5177

--- request headers ---
Accept: application/json
X-Fault-Key: 210a66c6-53cf-4d97-a9b7-df671e403e6e
X-Fault: unavailable-once
X-Correlation-Id: qa-a115d5e3-5467-47c9-989e-b577c13b5177
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a115d5e3-5467-47c9-989e-b577c13b5177
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-a115d5e3-5467-47c9-989e-b577c13b5177"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3dbda592-3bb2-4f30-bba1-9419b7822c41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dbda592-3bb2-4f30-bba1-9419b7822c41
Content-Type: application/json

--- request body ---
{"handle":"qa-c15850af37f5","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dbda592-3bb2-4f30-bba1-9419b7822c41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6947a502-d032-49cf-8fb1-e7d38a1dbba3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d6889672-6b55-41a7-9abe-e3dffdf1cc78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6889672-6b55-41a7-9abe-e3dffdf1cc78
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d6889672-6b55-41a7-9abe-e3dffdf1cc78
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
correlation: qa-d698f0fb-0628-43a7-834a-bfda58a42168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d698f0fb-0628-43a7-834a-bfda58a42168
Content-Type: application/json

--- request body ---
{"handle":"qa-c15850af37f5","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d698f0fb-0628-43a7-834a-bfda58a42168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d698f0fb-0628-43a7-834a-bfda58a42168"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14508f48-cb7c-4a22-8a67-d8d8ca974e61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14508f48-cb7c-4a22-8a67-d8d8ca974e61
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14508f48-cb7c-4a22-8a67-d8d8ca974e61
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
correlation: qa-fd857be2-68bc-46b3-9be1-e21f714894d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd857be2-68bc-46b3-9be1-e21f714894d9
Content-Type: application/json

--- request body ---
{"handle":"qa-07736bf0edf3","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd857be2-68bc-46b3-9be1-e21f714894d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fd857be2-68bc-46b3-9be1-e21f714894d9"}
```
