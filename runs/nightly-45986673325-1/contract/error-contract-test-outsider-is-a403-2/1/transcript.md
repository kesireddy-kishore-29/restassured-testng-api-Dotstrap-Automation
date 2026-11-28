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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-4186ff8c-bfd7-4a1a-b63f-d4e83b8c86bc` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-88d2bc6d-7da2-4883-8042-a8869c102a1d` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-df3de8f7-9b97-4be0-91c1-afbc8b6e7d9f` |
| 4 | `POST /v1/auth/token` | 200 | 58 | `qa-431f5286-afdd-4c7f-8a80-0fee5a7f2b34` |
| 5 | `POST /v1/conversations` | 201 | 15 | `qa-735c206a-240e-4059-adae-c54113ad86da` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-5c8bf580-20cf-42cc-a208-37d0907d197f` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 21 | `qa-1a91c4bd-b871-410f-92ec-b6bead0a2643` |
| 8 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-48428d8b-c2ea-463a-a065-28abf3995ee3` |
| 9 | `POST /v1/auth/token` | 401 | 37 | `qa-67236c6b-52df-432d-87a2-b41f1631d097` |
| 10 | `POST /v1/auth/token` | 200 | 43 | `qa-6a1c6838-9f7e-41f8-b5ae-7e5f65010fbf` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-bb8f6ded-962f-496b-9351-81cbaf92e2dd` |
| 12 | `POST /v1/auth/token` | 401 | 50 | `qa-5e956746-b5d5-4e5d-95b6-737b177a0cb2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-40b4cef6-7634-435e-8bf4-c892e694f2bb` |
| 14 | `POST /v1/auth/token` | 401 | 54 | `qa-699394a0-c06f-4e1e-aeea-c021bc5a1fc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4186ff8c-bfd7-4a1a-b63f-d4e83b8c86bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4186ff8c-bfd7-4a1a-b63f-d4e83b8c86bc
Content-Type: application/json

--- request body ---
{"handle":"qa-b18416a89bb1","displayName":"QA b18416a89bb1","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4186ff8c-bfd7-4a1a-b63f-d4e83b8c86bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-b18416a89bb1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48b9c94e-bffe-494e-bd66-13216546a09b","handle":"qa-b18416a89bb1","displayName":"QA b18416a89bb1","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.027965263Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-88d2bc6d-7da2-4883-8042-a8869c102a1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88d2bc6d-7da2-4883-8042-a8869c102a1d
Content-Type: application/json

--- request body ---
{"handle":"qa-257c4389af08","displayName":"QA 257c4389af08","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-88d2bc6d-7da2-4883-8042-a8869c102a1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-257c4389af08
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8cb11109-ded5-4a96-9520-2f534f3d1d79","handle":"qa-257c4389af08","displayName":"QA 257c4389af08","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.069068007Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-df3de8f7-9b97-4be0-91c1-afbc8b6e7d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df3de8f7-9b97-4be0-91c1-afbc8b6e7d9f
Content-Type: application/json

--- request body ---
{"handle":"qa-e3178f2c4580","displayName":"QA e3178f2c4580","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-df3de8f7-9b97-4be0-91c1-afbc8b6e7d9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Location: /v1/accounts/qa-e3178f2c4580
X-Served-Region: eu
Content-Length: 181

{"id":"acc_572b5e9b-6edd-4937-9003-7d2dd657e40d","handle":"qa-e3178f2c4580","displayName":"QA e3178f2c4580","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.127965313Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-431f5286-afdd-4c7f-8a80-0fee5a7f2b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431f5286-afdd-4c7f-8a80-0fee5a7f2b34
Content-Type: application/json

--- request body ---
{"handle":"qa-b18416a89bb1","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-431f5286-afdd-4c7f-8a80-0fee5a7f2b34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48b9c94e-bffe-494e-bd66-13216546a09b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-735c206a-240e-4059-adae-c54113ad86da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-735c206a-240e-4059-adae-c54113ad86da
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-257c4389af08","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-735c206a-240e-4059-adae-c54113ad86da
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
Location: /v1/conversations/cnv_a37dce88-8f18-41a0-8e01-f64e23b3c4c0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a37dce88-8f18-41a0-8e01-f64e23b3c4c0","subject":"Error contract","status":"open","region":"eu","participants":["qa-b18416a89bb1","qa-257c4389af08"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.256989578Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c8bf580-20cf-42cc-a208-37d0907d197f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c8bf580-20cf-42cc-a208-37d0907d197f
Content-Type: application/json

--- request body ---
{"handle":"qa-e3178f2c4580","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c8bf580-20cf-42cc-a208-37d0907d197f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_572b5e9b-6edd-4937-9003-7d2dd657e40d"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a37dce88-8f18-41a0-8e01-f64e23b3c4c0/messages
correlation: qa-1a91c4bd-b871-410f-92ec-b6bead0a2643

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a91c4bd-b871-410f-92ec-b6bead0a2643
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a91c4bd-b871-410f-92ec-b6bead0a2643
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a37dce88-8f18-41a0-8e01-f64e23b3c4c0/messages","correlationId":"qa-1a91c4bd-b871-410f-92ec-b6bead0a2643"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48428d8b-c2ea-463a-a065-28abf3995ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48428d8b-c2ea-463a-a065-28abf3995ee3
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48428d8b-c2ea-463a-a065-28abf3995ee3
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
correlation: qa-67236c6b-52df-432d-87a2-b41f1631d097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67236c6b-52df-432d-87a2-b41f1631d097
Content-Type: application/json

--- request body ---
{"handle":"qa-e3178f2c4580","password":"****"}

--- response: 401 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67236c6b-52df-432d-87a2-b41f1631d097
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67236c6b-52df-432d-87a2-b41f1631d097"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6a1c6838-9f7e-41f8-b5ae-7e5f65010fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a1c6838-9f7e-41f8-b5ae-7e5f65010fbf
Content-Type: application/json

--- request body ---
{"handle":"qa-257c4389af08","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a1c6838-9f7e-41f8-b5ae-7e5f65010fbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8cb11109-ded5-4a96-9520-2f534f3d1d79"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb8f6ded-962f-496b-9351-81cbaf92e2dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8f6ded-962f-496b-9351-81cbaf92e2dd
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb8f6ded-962f-496b-9351-81cbaf92e2dd
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
correlation: qa-5e956746-b5d5-4e5d-95b6-737b177a0cb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e956746-b5d5-4e5d-95b6-737b177a0cb2
Content-Type: application/json

--- request body ---
{"handle":"qa-257c4389af08","password":"****"}

--- response: 401 in 50 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e956746-b5d5-4e5d-95b6-737b177a0cb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e956746-b5d5-4e5d-95b6-737b177a0cb2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40b4cef6-7634-435e-8bf4-c892e694f2bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40b4cef6-7634-435e-8bf4-c892e694f2bb
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40b4cef6-7634-435e-8bf4-c892e694f2bb
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
correlation: qa-699394a0-c06f-4e1e-aeea-c021bc5a1fc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699394a0-c06f-4e1e-aeea-c021bc5a1fc4
Content-Type: application/json

--- request body ---
{"handle":"qa-b18416a89bb1","password":"****"}

--- response: 401 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-699394a0-c06f-4e1e-aeea-c021bc5a1fc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-699394a0-c06f-4e1e-aeea-c021bc5a1fc4"}
```
