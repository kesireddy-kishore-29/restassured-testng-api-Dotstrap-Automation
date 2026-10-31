# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-3b14670c-e6fb-488c-9395-e8c96d2d5d40` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-78f91128-4599-4451-a818-67319d90765d` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-2be764ad-a84d-47ca-bdae-504884a7b748` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-209dc594-8447-4481-aed5-858857a23a79` |
| 5 | `GET /v1/conversations/{id}` | 503 | 14 | `qa-36fd7d85-6f12-41b8-9db1-2fbe2d2c5050` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-91644012-4e87-4183-82c7-50ae7f8b2839` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-b17ee679-63af-4233-9b37-c98df13e0988` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-1a656187-5f56-4579-916b-ef2e87d1a161` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-09f7ce06-41ba-4298-b1b4-142fa69b4588` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-435db8a7-bec9-472a-8c37-e4076ed75f92` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3b14670c-e6fb-488c-9395-e8c96d2d5d40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b14670c-e6fb-488c-9395-e8c96d2d5d40
Content-Type: application/json

--- request body ---
{"handle":"qa-c861595f986c","displayName":"QA c861595f986c","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b14670c-e6fb-488c-9395-e8c96d2d5d40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Location: /v1/accounts/qa-c861595f986c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a71aee5d-4fa8-4e74-b546-b620ca9a3042","handle":"qa-c861595f986c","displayName":"QA c861595f986c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.659154514Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-78f91128-4599-4451-a818-67319d90765d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78f91128-4599-4451-a818-67319d90765d
Content-Type: application/json

--- request body ---
{"handle":"qa-b08578b27047","displayName":"QA b08578b27047","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-78f91128-4599-4451-a818-67319d90765d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-b08578b27047
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ce77365-00bb-4651-9f5a-961497d7c632","handle":"qa-b08578b27047","displayName":"QA b08578b27047","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.733774494Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2be764ad-a84d-47ca-bdae-504884a7b748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2be764ad-a84d-47ca-bdae-504884a7b748
Content-Type: application/json

--- request body ---
{"handle":"qa-c861595f986c","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2be764ad-a84d-47ca-bdae-504884a7b748
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a71aee5d-4fa8-4e74-b546-b620ca9a3042"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-209dc594-8447-4481-aed5-858857a23a79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-209dc594-8447-4481-aed5-858857a23a79
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b08578b27047","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-209dc594-8447-4481-aed5-858857a23a79
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
Location: /v1/conversations/cnv_720ab98a-1644-47cd-92ed-419cdf169a46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_720ab98a-1644-47cd-92ed-419cdf169a46","subject":"Error contract","status":"open","region":"eu","participants":["qa-c861595f986c","qa-b08578b27047"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.829578862Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_720ab98a-1644-47cd-92ed-419cdf169a46
correlation: qa-36fd7d85-6f12-41b8-9db1-2fbe2d2c5050

--- request headers ---
Accept: application/json
X-Fault-Key: 964a6570-9d51-4cb9-b2b9-f29b33cdb0e0
X-Fault: unavailable-once
X-Correlation-Id: qa-36fd7d85-6f12-41b8-9db1-2fbe2d2c5050
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36fd7d85-6f12-41b8-9db1-2fbe2d2c5050
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_720ab98a-1644-47cd-92ed-419cdf169a46","correlationId":"qa-36fd7d85-6f12-41b8-9db1-2fbe2d2c5050"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91644012-4e87-4183-82c7-50ae7f8b2839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91644012-4e87-4183-82c7-50ae7f8b2839
Content-Type: application/json

--- request body ---
{"handle":"qa-b08578b27047","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-91644012-4e87-4183-82c7-50ae7f8b2839
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ce77365-00bb-4651-9f5a-961497d7c632"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b17ee679-63af-4233-9b37-c98df13e0988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b17ee679-63af-4233-9b37-c98df13e0988
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b17ee679-63af-4233-9b37-c98df13e0988
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
correlation: qa-1a656187-5f56-4579-916b-ef2e87d1a161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a656187-5f56-4579-916b-ef2e87d1a161
Content-Type: application/json

--- request body ---
{"handle":"qa-b08578b27047","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a656187-5f56-4579-916b-ef2e87d1a161
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a656187-5f56-4579-916b-ef2e87d1a161"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09f7ce06-41ba-4298-b1b4-142fa69b4588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f7ce06-41ba-4298-b1b4-142fa69b4588
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09f7ce06-41ba-4298-b1b4-142fa69b4588
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
correlation: qa-435db8a7-bec9-472a-8c37-e4076ed75f92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435db8a7-bec9-472a-8c37-e4076ed75f92
Content-Type: application/json

--- request body ---
{"handle":"qa-c861595f986c","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-435db8a7-bec9-472a-8c37-e4076ed75f92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-435db8a7-bec9-472a-8c37-e4076ed75f92"}
```
