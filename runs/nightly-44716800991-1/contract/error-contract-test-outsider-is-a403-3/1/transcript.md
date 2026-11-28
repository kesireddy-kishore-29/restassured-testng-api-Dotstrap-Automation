# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-29c3d322-0aab-4983-9cf0-5bcc57589be0` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-d8c9f389-eab5-4966-818a-d73a671d3141` |
| 3 | `POST /v1/accounts` | 201 | 12 | `qa-1385af55-8c48-478a-8496-62353731b8fc` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-3798e44d-c382-4b21-82e3-446b953adfdc` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-bb58045b-a9db-44dd-96ef-fe3c0ab3b297` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-da0479e7-2f00-4adb-8cc6-e2f689562377` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 19 | `qa-bfb2846e-644b-4a07-9b3f-809d7994fd4f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 52 | `qa-b3943d9f-fd71-4ec2-9480-47b56576e738` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-868f25fa-5bcb-47b2-adc4-b7fcfcbfbccd` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-7e1386e8-74ec-4b1d-b8e8-ee983d89ca06` |
| 11 | `DELETE /v1/accounts/me` | 204 | 83 | `qa-f03a7d65-f299-4c08-9954-b60e15c426c3` |
| 12 | `POST /v1/auth/token` | 401 | 36 | `qa-86cef417-4e9d-4c6a-9c5f-a75591019c69` |
| 13 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-09e5ba0b-3931-42ee-8741-27605ca5b4ed` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-0a24c45f-5fd1-4e73-a165-fb5cc20f87e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29c3d322-0aab-4983-9cf0-5bcc57589be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c3d322-0aab-4983-9cf0-5bcc57589be0
Content-Type: application/json

--- request body ---
{"handle":"qa-0117006c744b","displayName":"QA 0117006c744b","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-29c3d322-0aab-4983-9cf0-5bcc57589be0
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
Location: /v1/accounts/qa-0117006c744b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4da8c66b-12d1-4afb-9e29-d10ff2706e00","handle":"qa-0117006c744b","displayName":"QA 0117006c744b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.722213230Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d8c9f389-eab5-4966-818a-d73a671d3141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8c9f389-eab5-4966-818a-d73a671d3141
Content-Type: application/json

--- request body ---
{"handle":"qa-8fc2656e7d61","displayName":"QA 8fc2656e7d61","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8c9f389-eab5-4966-818a-d73a671d3141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-8fc2656e7d61
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea3cc7d1-5f3c-4478-93d0-02059eb0893c","handle":"qa-8fc2656e7d61","displayName":"QA 8fc2656e7d61","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.765644193Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1385af55-8c48-478a-8496-62353731b8fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1385af55-8c48-478a-8496-62353731b8fc
Content-Type: application/json

--- request body ---
{"handle":"qa-26f2c7e28b84","displayName":"QA 26f2c7e28b84","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1385af55-8c48-478a-8496-62353731b8fc
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
Location: /v1/accounts/qa-26f2c7e28b84
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea7e7e11-cd66-4d2f-a1dd-8e4b6161baac","handle":"qa-26f2c7e28b84","displayName":"QA 26f2c7e28b84","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.783466962Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3798e44d-c382-4b21-82e3-446b953adfdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3798e44d-c382-4b21-82e3-446b953adfdc
Content-Type: application/json

--- request body ---
{"handle":"qa-0117006c744b","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3798e44d-c382-4b21-82e3-446b953adfdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4da8c66b-12d1-4afb-9e29-d10ff2706e00"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-bb58045b-a9db-44dd-96ef-fe3c0ab3b297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb58045b-a9db-44dd-96ef-fe3c0ab3b297
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8fc2656e7d61","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb58045b-a9db-44dd-96ef-fe3c0ab3b297
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
Location: /v1/conversations/cnv_ff3a35de-ff69-460b-b71f-c7487aa2f121
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ff3a35de-ff69-460b-b71f-c7487aa2f121","subject":"Error contract","status":"open","region":"eu","participants":["qa-0117006c744b","qa-8fc2656e7d61"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.840418485Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da0479e7-2f00-4adb-8cc6-e2f689562377

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da0479e7-2f00-4adb-8cc6-e2f689562377
Content-Type: application/json

--- request body ---
{"handle":"qa-26f2c7e28b84","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-da0479e7-2f00-4adb-8cc6-e2f689562377
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea7e7e11-cd66-4d2f-a1dd-8e4b6161baac"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ff3a35de-ff69-460b-b71f-c7487aa2f121/read
correlation: qa-bfb2846e-644b-4a07-9b3f-809d7994fd4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb2846e-644b-4a07-9b3f-809d7994fd4f
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfb2846e-644b-4a07-9b3f-809d7994fd4f
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ff3a35de-ff69-460b-b71f-c7487aa2f121/read","correlationId":"qa-bfb2846e-644b-4a07-9b3f-809d7994fd4f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3943d9f-fd71-4ec2-9480-47b56576e738

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3943d9f-fd71-4ec2-9480-47b56576e738
Content-Type: application/json

--- response: 204 in 52 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3943d9f-fd71-4ec2-9480-47b56576e738
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
correlation: qa-868f25fa-5bcb-47b2-adc4-b7fcfcbfbccd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-868f25fa-5bcb-47b2-adc4-b7fcfcbfbccd
Content-Type: application/json

--- request body ---
{"handle":"qa-26f2c7e28b84","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-868f25fa-5bcb-47b2-adc4-b7fcfcbfbccd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-868f25fa-5bcb-47b2-adc4-b7fcfcbfbccd"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7e1386e8-74ec-4b1d-b8e8-ee983d89ca06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e1386e8-74ec-4b1d-b8e8-ee983d89ca06
Content-Type: application/json

--- request body ---
{"handle":"qa-8fc2656e7d61","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e1386e8-74ec-4b1d-b8e8-ee983d89ca06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea3cc7d1-5f3c-4478-93d0-02059eb0893c"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f03a7d65-f299-4c08-9954-b60e15c426c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f03a7d65-f299-4c08-9954-b60e15c426c3
Content-Type: application/json

--- response: 204 in 83 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f03a7d65-f299-4c08-9954-b60e15c426c3
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
correlation: qa-86cef417-4e9d-4c6a-9c5f-a75591019c69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86cef417-4e9d-4c6a-9c5f-a75591019c69
Content-Type: application/json

--- request body ---
{"handle":"qa-8fc2656e7d61","password":"****"}

--- response: 401 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86cef417-4e9d-4c6a-9c5f-a75591019c69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86cef417-4e9d-4c6a-9c5f-a75591019c69"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09e5ba0b-3931-42ee-8741-27605ca5b4ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e5ba0b-3931-42ee-8741-27605ca5b4ed
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09e5ba0b-3931-42ee-8741-27605ca5b4ed
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-0a24c45f-5fd1-4e73-a165-fb5cc20f87e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a24c45f-5fd1-4e73-a165-fb5cc20f87e6
Content-Type: application/json

--- request body ---
{"handle":"qa-0117006c744b","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a24c45f-5fd1-4e73-a165-fb5cc20f87e6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a24c45f-5fd1-4e73-a165-fb5cc20f87e6"}
```
