# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-f3819b29-4bfb-4372-91ad-9a0a251a9191` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-a2437438-3583-44a2-98f0-6774fa22a3cf` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-5366008e-5936-4c28-aab7-0c2591abc975` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-7b07dada-8a0c-4799-a35b-dfd612803a04` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-91e5a502-9a38-46fa-9a3c-bfeebdcfde26` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-0098eac0-01d3-4920-8220-3741bd278141` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 5 | `qa-26721d13-a1b5-4d56-b812-98bb877392e3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-02babaa3-ee39-4d16-93a0-92d5177dd87b` |
| 9 | `POST /v1/auth/token` | 401 | 29 | `qa-4247853b-540e-4c0a-b076-cd5a0c58bb32` |
| 10 | `POST /v1/auth/token` | 200 | 74 | `qa-7dc87b73-b296-443b-8f2c-248cfbbe0af6` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-bf575c97-7851-4e8a-a935-540dc01fed8f` |
| 12 | `POST /v1/auth/token` | 401 | 42 | `qa-0c26259c-eacd-40d4-a906-b834879cb1ed` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ef84babd-cda6-4f05-8d17-52118b5868dc` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-96b76536-5c7d-4178-bc8e-ea84a7cf0332` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f3819b29-4bfb-4372-91ad-9a0a251a9191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3819b29-4bfb-4372-91ad-9a0a251a9191
Content-Type: application/json

--- request body ---
{"handle":"qa-4b0a9677f422","displayName":"QA 4b0a9677f422","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3819b29-4bfb-4372-91ad-9a0a251a9191
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-4b0a9677f422
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5407e3f7-1d56-4620-b8bf-a02d397b3e4d","handle":"qa-4b0a9677f422","displayName":"QA 4b0a9677f422","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.098122138Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2437438-3583-44a2-98f0-6774fa22a3cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2437438-3583-44a2-98f0-6774fa22a3cf
Content-Type: application/json

--- request body ---
{"handle":"qa-fabeb300e8c8","displayName":"QA fabeb300e8c8","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2437438-3583-44a2-98f0-6774fa22a3cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-fabeb300e8c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_203ec479-2a6c-4f63-84ba-fadaafc3dc41","handle":"qa-fabeb300e8c8","displayName":"QA fabeb300e8c8","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.141580588Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5366008e-5936-4c28-aab7-0c2591abc975

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5366008e-5936-4c28-aab7-0c2591abc975
Content-Type: application/json

--- request body ---
{"handle":"qa-ec8e7bf65f3f","displayName":"QA ec8e7bf65f3f","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5366008e-5936-4c28-aab7-0c2591abc975
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-ec8e7bf65f3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1bdd7be-4416-4ac5-89a7-7b76ebcf8c8b","handle":"qa-ec8e7bf65f3f","displayName":"QA ec8e7bf65f3f","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.176591072Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7b07dada-8a0c-4799-a35b-dfd612803a04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b07dada-8a0c-4799-a35b-dfd612803a04
Content-Type: application/json

--- request body ---
{"handle":"qa-4b0a9677f422","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b07dada-8a0c-4799-a35b-dfd612803a04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5407e3f7-1d56-4620-b8bf-a02d397b3e4d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-91e5a502-9a38-46fa-9a3c-bfeebdcfde26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91e5a502-9a38-46fa-9a3c-bfeebdcfde26
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fabeb300e8c8","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-91e5a502-9a38-46fa-9a3c-bfeebdcfde26
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
Location: /v1/conversations/cnv_8f689d5d-3915-4389-9544-f42f03ea6dc8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8f689d5d-3915-4389-9544-f42f03ea6dc8","subject":"Error contract","status":"open","region":"eu","participants":["qa-4b0a9677f422","qa-fabeb300e8c8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.242784813Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0098eac0-01d3-4920-8220-3741bd278141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0098eac0-01d3-4920-8220-3741bd278141
Content-Type: application/json

--- request body ---
{"handle":"qa-ec8e7bf65f3f","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0098eac0-01d3-4920-8220-3741bd278141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1bdd7be-4416-4ac5-89a7-7b76ebcf8c8b"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8f689d5d-3915-4389-9544-f42f03ea6dc8/messages
correlation: qa-26721d13-a1b5-4d56-b812-98bb877392e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26721d13-a1b5-4d56-b812-98bb877392e3
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26721d13-a1b5-4d56-b812-98bb877392e3
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8f689d5d-3915-4389-9544-f42f03ea6dc8/messages","correlationId":"qa-26721d13-a1b5-4d56-b812-98bb877392e3"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02babaa3-ee39-4d16-93a0-92d5177dd87b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02babaa3-ee39-4d16-93a0-92d5177dd87b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02babaa3-ee39-4d16-93a0-92d5177dd87b
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4247853b-540e-4c0a-b076-cd5a0c58bb32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4247853b-540e-4c0a-b076-cd5a0c58bb32
Content-Type: application/json

--- request body ---
{"handle":"qa-ec8e7bf65f3f","password":"****"}

--- response: 401 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4247853b-540e-4c0a-b076-cd5a0c58bb32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4247853b-540e-4c0a-b076-cd5a0c58bb32"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7dc87b73-b296-443b-8f2c-248cfbbe0af6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dc87b73-b296-443b-8f2c-248cfbbe0af6
Content-Type: application/json

--- request body ---
{"handle":"qa-fabeb300e8c8","password":"****"}

--- response: 200 in 74 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dc87b73-b296-443b-8f2c-248cfbbe0af6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_203ec479-2a6c-4f63-84ba-fadaafc3dc41"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf575c97-7851-4e8a-a935-540dc01fed8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf575c97-7851-4e8a-a935-540dc01fed8f
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf575c97-7851-4e8a-a935-540dc01fed8f
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-0c26259c-eacd-40d4-a906-b834879cb1ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c26259c-eacd-40d4-a906-b834879cb1ed
Content-Type: application/json

--- request body ---
{"handle":"qa-fabeb300e8c8","password":"****"}

--- response: 401 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c26259c-eacd-40d4-a906-b834879cb1ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c26259c-eacd-40d4-a906-b834879cb1ed"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef84babd-cda6-4f05-8d17-52118b5868dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef84babd-cda6-4f05-8d17-52118b5868dc
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef84babd-cda6-4f05-8d17-52118b5868dc
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-96b76536-5c7d-4178-bc8e-ea84a7cf0332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b76536-5c7d-4178-bc8e-ea84a7cf0332
Content-Type: application/json

--- request body ---
{"handle":"qa-4b0a9677f422","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96b76536-5c7d-4178-bc8e-ea84a7cf0332
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96b76536-5c7d-4178-bc8e-ea84a7cf0332"}
```
