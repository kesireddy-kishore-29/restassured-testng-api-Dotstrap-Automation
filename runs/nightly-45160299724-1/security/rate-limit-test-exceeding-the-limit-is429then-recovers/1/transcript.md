# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 84 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-2812bde8-39c7-4fee-96c0-9660e6f58ef1` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-db2f35d6-a4cf-4913-8919-88a0ae9aa0c2` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-1eee8549-c529-4f9b-9172-1ab71c974a10` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-869b0223-e19e-4a5c-8394-e9c8f914b956` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-1da3741d-2dbf-4047-b70a-7ad191101db4` |
| 6 | `GET /v1/accounts/me` | 200 | 6 | `qa-b5f56fe7-23ef-4b24-a92b-6f3e6246bfac` |
| 7 | `GET /v1/accounts/me` | 200 | 6 | `qa-b32341b0-50ee-4021-ad4c-12081e367f9b` |
| 8 | `GET /v1/accounts/me` | 200 | 9 | `qa-82b477e7-9020-4078-9d24-fdef84e4a3a5` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-af3bf506-a086-4ca5-955a-7c16ce80c205` |
| 10 | `GET /v1/accounts/me` | 200 | 6 | `qa-45194f31-abce-43b8-b330-cf4a277efa8e` |
| 11 | `GET /v1/accounts/me` | 200 | 6 | `qa-cb5b210b-5a1f-475a-a444-80601865e254` |
| 12 | `GET /v1/accounts/me` | 200 | 5 | `qa-4822920f-420f-41fb-91dd-003e0d9204e4` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-33a53f9b-bd2f-43e2-b034-080cbaf81ca7` |
| 14 | `GET /v1/accounts/me` | 200 | 4 | `qa-f9b2ad0c-d600-4cda-a41e-e2e2eef4ae79` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-d8758f35-71e6-4b6a-b654-9bd2c0233844` |
| 16 | `GET /v1/accounts/me` | 200 | 4 | `qa-353de740-e5b5-497e-afea-8734def1cf96` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-e0cc54a1-17cf-4cdc-9bda-2298ff24fe10` |
| 18 | `GET /v1/accounts/me` | 200 | 7 | `qa-43b9d52f-6755-44f9-a770-eaaead592f31` |
| 19 | `GET /v1/accounts/me` | 200 | 6 | `qa-4199dceb-f420-4329-9fc0-d57257fbf18f` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-1f532f4e-07d8-40ff-9f2d-2c92656c70bc` |
| 21 | `GET /v1/accounts/me` | 200 | 10 | `qa-d104eda8-2a64-4287-aa47-f9f59eac70d2` |
| 22 | `GET /v1/accounts/me` | 200 | 5 | `qa-b2c8bad3-d3bf-4e1f-87f4-afd5833f8ced` |
| 23 | `GET /v1/accounts/me` | 200 | 4 | `qa-bfb81356-e8fb-4463-a4a7-caec91838d56` |
| 24 | `GET /v1/accounts/me` | 200 | 4 | `qa-0ddb643e-70ee-4311-9da3-c7509b7587a0` |
| 25 | `GET /v1/accounts/me` | 200 | 9 | `qa-2723ea27-a62d-442f-86e8-604b0c5c71f7` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-8b8db590-2008-493f-89e2-15585f5106b1` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-1fed895a-81b3-4535-870d-1c40f8ecbc70` |
| 28 | `GET /v1/accounts/me` | 200 | 5 | `qa-82ffa763-a689-4a33-bca5-e4d8410d8987` |
| 29 | `GET /v1/accounts/me` | 200 | 6 | `qa-bad3650f-a7b3-4373-a7b0-eb33ce3fbc12` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-84089efa-daec-46e2-b38e-2f203a3f31a9` |
| 31 | `GET /v1/accounts/me` | 200 | 6 | `qa-426b843c-9547-4fbc-88ed-fc5017d56dfc` |
| 32 | `GET /v1/accounts/me` | 200 | 5 | `qa-aef5bbc5-e377-441a-aeaa-1b01dde66b30` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-d2df5fec-49c5-4e71-a1fd-4facebf3fa31` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-ae686a9f-8b18-480a-a942-22f9eb0acbac` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-e2b27a00-bc13-459c-858e-f156c87eba5b` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-26d0793a-c3b0-401e-928f-8302847e0afc` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-3c4b782e-bbb8-4017-aa02-b32ca00bea7f` |
| 38 | `GET /v1/accounts/me` | 200 | 7 | `qa-cc529da2-aed0-4af2-8af0-d553735be8f8` |
| 39 | `GET /v1/accounts/me` | 200 | 4 | `qa-39057817-9403-44e2-b556-040a6ac7b680` |
| 40 | `GET /v1/accounts/me` | 200 | 4 | `qa-d5edbfa4-c453-4a96-918c-66b60fdb8221` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-f241fa54-ed52-41b4-a5a6-55f7bd16e1a2` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-f55f4464-ea20-4afc-92dd-8a49e7013be6` |
| 43 | `GET /v1/accounts/me` | 200 | 3 | `qa-9695a100-6de0-43e7-8b66-bbb0865319bb` |
| 44 | `GET /v1/accounts/me` | 200 | 5 | `qa-75eb0824-e2ad-4efb-852a-d1b86155f1dc` |
| 45 | `GET /v1/accounts/me` | 200 | 3 | `qa-de083652-aaff-46f9-a74f-33005e4a46ca` |
| 46 | `GET /v1/accounts/me` | 200 | 4 | `qa-ce0d1062-24ce-42b7-a308-118978bec2d9` |
| 47 | `GET /v1/accounts/me` | 200 | 6 | `qa-e7658c7e-1ee9-4ed8-affc-16e38d08ef6c` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-784040e0-0875-470d-8842-8c707af3b0a6` |
| 49 | `GET /v1/accounts/me` | 200 | 4 | `qa-85c665a7-8824-45eb-a8a0-d783ef61f4d2` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-550cb84d-8494-41f7-8379-14689f03aa20` |
| 51 | `GET /v1/accounts/me` | 200 | 8 | `qa-6e5586a3-a844-4d0a-8352-06bd68b183a7` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-fa68d0d3-7dde-4fea-8b7f-e67c97d07d9f` |
| 53 | `GET /v1/accounts/me` | 200 | 7 | `qa-ac8ebb4a-5dd7-4596-b42b-a730c8bbd070` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-20ed7699-d05c-4227-be29-9031af4e0751` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-26e4e77c-f5b9-4b34-b649-505e679c7203` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-cab6e9e1-507d-4b19-b6f7-7ab22441a15d` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-c45901e7-f811-490b-a666-5d0275351faf` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-8e6e1ae4-e9a6-49ae-9920-c0fdc5975704` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-1dde3f72-013f-4cdc-b186-ba6419b3f250` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-a8379f5f-7df5-4a4c-aba2-bb8e00d81d16` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-13bbeacc-309a-4ec4-bcf9-097f2b5c2ddc` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-59b6bd00-52ed-4bc9-900f-45707d7472f3` |
| 63 | `GET /v1/accounts/me` | 429 | 4 | `qa-57ab69b8-2bd0-4c6a-b1dd-5c63c8869ec4` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-52920b06-3bbc-42c5-840a-3ae94c7ffde8` |
| 65 | `GET /v1/accounts/me` | 429 | 7 | `qa-05e0d43f-2860-437d-9bd5-82b49cbd83ea` |
| 66 | `GET /v1/accounts/me` | 429 | 6 | `qa-2e742ce4-5ce5-4220-9efa-e48e4ddfd5c6` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-96621b3d-7251-42c5-996c-9199b1fe4b2a` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-b196c1ab-739d-40d1-86bf-3c9eda2e7508` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-a86cd854-911f-4866-a811-7f73fffb4988` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-e523dff3-0d5a-4553-b732-fc4bb9eb603a` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-e5ddd826-c4dc-43eb-b91c-63cb44c37993` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-24e4c057-4b98-4d6f-a4d4-b4797cdfc275` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-1281eef6-7db3-4800-83a9-540ff03090e0` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-4b79f832-b816-4a12-8794-7eb4b2f85f6b` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-b0b0f32b-bd3a-40c3-a43f-f604cd9f3487` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-8f79b004-60b7-4f16-967d-055398e8f1ae` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-eee59095-886a-4081-8adb-209c8e1af3bd` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-ef210254-7c3a-4402-834a-f33ac44b192a` |
| 79 | `GET /v1/accounts/me` | 429 | 5 | `qa-a02b5e63-3845-4dbe-9e9c-f0e5d7e68f07` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-47c8b97d-5870-4b0e-8033-3e3d8d7eaa47` |
| 81 | `GET /v1/accounts/me` | 429 | 5 | `qa-c38325c9-f4c0-40fd-b269-865574d54917` |
| 82 | `GET /v1/accounts/me` | 200 | 5 | `qa-815cf7db-76e1-4810-8a63-900dfea76c2b` |
| 83 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-983c072e-5070-487e-8655-809cee6c97f3` |
| 84 | `POST /v1/auth/token` | 401 | 3 | `qa-37747e2b-a274-47ef-be43-7d94de07bb8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2812bde8-39c7-4fee-96c0-9660e6f58ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2812bde8-39c7-4fee-96c0-9660e6f58ef1
Content-Type: application/json

--- request body ---
{"handle":"qa-2d1697133984","displayName":"QA 2d1697133984","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2812bde8-39c7-4fee-96c0-9660e6f58ef1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-2d1697133984
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-db2f35d6-a4cf-4913-8919-88a0ae9aa0c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db2f35d6-a4cf-4913-8919-88a0ae9aa0c2
Content-Type: application/json

--- request body ---
{"handle":"qa-2d1697133984","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-db2f35d6-a4cf-4913-8919-88a0ae9aa0c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1eee8549-c529-4f9b-9172-1ab71c974a10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eee8549-c529-4f9b-9172-1ab71c974a10
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eee8549-c529-4f9b-9172-1ab71c974a10
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
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-869b0223-e19e-4a5c-8394-e9c8f914b956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-869b0223-e19e-4a5c-8394-e9c8f914b956
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-869b0223-e19e-4a5c-8394-e9c8f914b956
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
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1da3741d-2dbf-4047-b70a-7ad191101db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1da3741d-2dbf-4047-b70a-7ad191101db4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1da3741d-2dbf-4047-b70a-7ad191101db4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5f56fe7-23ef-4b24-a92b-6f3e6246bfac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5f56fe7-23ef-4b24-a92b-6f3e6246bfac
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5f56fe7-23ef-4b24-a92b-6f3e6246bfac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-b32341b0-50ee-4021-ad4c-12081e367f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b32341b0-50ee-4021-ad4c-12081e367f9b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b32341b0-50ee-4021-ad4c-12081e367f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-82b477e7-9020-4078-9d24-fdef84e4a3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82b477e7-9020-4078-9d24-fdef84e4a3a5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-82b477e7-9020-4078-9d24-fdef84e4a3a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-af3bf506-a086-4ca5-955a-7c16ce80c205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af3bf506-a086-4ca5-955a-7c16ce80c205
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-af3bf506-a086-4ca5-955a-7c16ce80c205
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-45194f31-abce-43b8-b330-cf4a277efa8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45194f31-abce-43b8-b330-cf4a277efa8e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-45194f31-abce-43b8-b330-cf4a277efa8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb5b210b-5a1f-475a-a444-80601865e254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb5b210b-5a1f-475a-a444-80601865e254
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb5b210b-5a1f-475a-a444-80601865e254
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-4822920f-420f-41fb-91dd-003e0d9204e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4822920f-420f-41fb-91dd-003e0d9204e4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4822920f-420f-41fb-91dd-003e0d9204e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-33a53f9b-bd2f-43e2-b034-080cbaf81ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a53f9b-bd2f-43e2-b034-080cbaf81ca7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a53f9b-bd2f-43e2-b034-080cbaf81ca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9b2ad0c-d600-4cda-a41e-e2e2eef4ae79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b2ad0c-d600-4cda-a41e-e2e2eef4ae79
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9b2ad0c-d600-4cda-a41e-e2e2eef4ae79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8758f35-71e6-4b6a-b654-9bd2c0233844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8758f35-71e6-4b6a-b654-9bd2c0233844
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8758f35-71e6-4b6a-b654-9bd2c0233844
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-353de740-e5b5-497e-afea-8734def1cf96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-353de740-e5b5-497e-afea-8734def1cf96
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-353de740-e5b5-497e-afea-8734def1cf96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0cc54a1-17cf-4cdc-9bda-2298ff24fe10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0cc54a1-17cf-4cdc-9bda-2298ff24fe10
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0cc54a1-17cf-4cdc-9bda-2298ff24fe10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-43b9d52f-6755-44f9-a770-eaaead592f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43b9d52f-6755-44f9-a770-eaaead592f31
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-43b9d52f-6755-44f9-a770-eaaead592f31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-4199dceb-f420-4329-9fc0-d57257fbf18f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4199dceb-f420-4329-9fc0-d57257fbf18f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4199dceb-f420-4329-9fc0-d57257fbf18f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f532f4e-07d8-40ff-9f2d-2c92656c70bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f532f4e-07d8-40ff-9f2d-2c92656c70bc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f532f4e-07d8-40ff-9f2d-2c92656c70bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-d104eda8-2a64-4287-aa47-f9f59eac70d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d104eda8-2a64-4287-aa47-f9f59eac70d2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d104eda8-2a64-4287-aa47-f9f59eac70d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2c8bad3-d3bf-4e1f-87f4-afd5833f8ced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2c8bad3-d3bf-4e1f-87f4-afd5833f8ced
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2c8bad3-d3bf-4e1f-87f4-afd5833f8ced
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfb81356-e8fb-4463-a4a7-caec91838d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb81356-e8fb-4463-a4a7-caec91838d56
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfb81356-e8fb-4463-a4a7-caec91838d56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ddb643e-70ee-4311-9da3-c7509b7587a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ddb643e-70ee-4311-9da3-c7509b7587a0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ddb643e-70ee-4311-9da3-c7509b7587a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-2723ea27-a62d-442f-86e8-604b0c5c71f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2723ea27-a62d-442f-86e8-604b0c5c71f7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2723ea27-a62d-442f-86e8-604b0c5c71f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b8db590-2008-493f-89e2-15585f5106b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b8db590-2008-493f-89e2-15585f5106b1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b8db590-2008-493f-89e2-15585f5106b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-1fed895a-81b3-4535-870d-1c40f8ecbc70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fed895a-81b3-4535-870d-1c40f8ecbc70
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fed895a-81b3-4535-870d-1c40f8ecbc70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-82ffa763-a689-4a33-bca5-e4d8410d8987

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ffa763-a689-4a33-bca5-e4d8410d8987
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-82ffa763-a689-4a33-bca5-e4d8410d8987
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-bad3650f-a7b3-4373-a7b0-eb33ce3fbc12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad3650f-a7b3-4373-a7b0-eb33ce3fbc12
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bad3650f-a7b3-4373-a7b0-eb33ce3fbc12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-84089efa-daec-46e2-b38e-2f203a3f31a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84089efa-daec-46e2-b38e-2f203a3f31a9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-84089efa-daec-46e2-b38e-2f203a3f31a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-426b843c-9547-4fbc-88ed-fc5017d56dfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-426b843c-9547-4fbc-88ed-fc5017d56dfc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-426b843c-9547-4fbc-88ed-fc5017d56dfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-aef5bbc5-e377-441a-aeaa-1b01dde66b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aef5bbc5-e377-441a-aeaa-1b01dde66b30
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-aef5bbc5-e377-441a-aeaa-1b01dde66b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2df5fec-49c5-4e71-a1fd-4facebf3fa31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2df5fec-49c5-4e71-a1fd-4facebf3fa31
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2df5fec-49c5-4e71-a1fd-4facebf3fa31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae686a9f-8b18-480a-a942-22f9eb0acbac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae686a9f-8b18-480a-a942-22f9eb0acbac
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae686a9f-8b18-480a-a942-22f9eb0acbac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2b27a00-bc13-459c-858e-f156c87eba5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2b27a00-bc13-459c-858e-f156c87eba5b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2b27a00-bc13-459c-858e-f156c87eba5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-26d0793a-c3b0-401e-928f-8302847e0afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d0793a-c3b0-401e-928f-8302847e0afc
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-26d0793a-c3b0-401e-928f-8302847e0afc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c4b782e-bbb8-4017-aa02-b32ca00bea7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c4b782e-bbb8-4017-aa02-b32ca00bea7f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c4b782e-bbb8-4017-aa02-b32ca00bea7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc529da2-aed0-4af2-8af0-d553735be8f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc529da2-aed0-4af2-8af0-d553735be8f8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc529da2-aed0-4af2-8af0-d553735be8f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-39057817-9403-44e2-b556-040a6ac7b680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39057817-9403-44e2-b556-040a6ac7b680
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-39057817-9403-44e2-b556-040a6ac7b680
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5edbfa4-c453-4a96-918c-66b60fdb8221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5edbfa4-c453-4a96-918c-66b60fdb8221
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5edbfa4-c453-4a96-918c-66b60fdb8221
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-f241fa54-ed52-41b4-a5a6-55f7bd16e1a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f241fa54-ed52-41b4-a5a6-55f7bd16e1a2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f241fa54-ed52-41b4-a5a6-55f7bd16e1a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-f55f4464-ea20-4afc-92dd-8a49e7013be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f55f4464-ea20-4afc-92dd-8a49e7013be6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f55f4464-ea20-4afc-92dd-8a49e7013be6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-9695a100-6de0-43e7-8b66-bbb0865319bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9695a100-6de0-43e7-8b66-bbb0865319bb
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9695a100-6de0-43e7-8b66-bbb0865319bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-75eb0824-e2ad-4efb-852a-d1b86155f1dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75eb0824-e2ad-4efb-852a-d1b86155f1dc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-75eb0824-e2ad-4efb-852a-d1b86155f1dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-de083652-aaff-46f9-a74f-33005e4a46ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de083652-aaff-46f9-a74f-33005e4a46ca
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-de083652-aaff-46f9-a74f-33005e4a46ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce0d1062-24ce-42b7-a308-118978bec2d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0d1062-24ce-42b7-a308-118978bec2d9
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce0d1062-24ce-42b7-a308-118978bec2d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7658c7e-1ee9-4ed8-affc-16e38d08ef6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7658c7e-1ee9-4ed8-affc-16e38d08ef6c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7658c7e-1ee9-4ed8-affc-16e38d08ef6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-784040e0-0875-470d-8842-8c707af3b0a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-784040e0-0875-470d-8842-8c707af3b0a6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-784040e0-0875-470d-8842-8c707af3b0a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-85c665a7-8824-45eb-a8a0-d783ef61f4d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c665a7-8824-45eb-a8a0-d783ef61f4d2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c665a7-8824-45eb-a8a0-d783ef61f4d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-550cb84d-8494-41f7-8379-14689f03aa20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550cb84d-8494-41f7-8379-14689f03aa20
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-550cb84d-8494-41f7-8379-14689f03aa20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e5586a3-a844-4d0a-8352-06bd68b183a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5586a3-a844-4d0a-8352-06bd68b183a7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e5586a3-a844-4d0a-8352-06bd68b183a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa68d0d3-7dde-4fea-8b7f-e67c97d07d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa68d0d3-7dde-4fea-8b7f-e67c97d07d9f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa68d0d3-7dde-4fea-8b7f-e67c97d07d9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac8ebb4a-5dd7-4596-b42b-a730c8bbd070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8ebb4a-5dd7-4596-b42b-a730c8bbd070
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8ebb4a-5dd7-4596-b42b-a730c8bbd070
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-20ed7699-d05c-4227-be29-9031af4e0751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ed7699-d05c-4227-be29-9031af4e0751
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-20ed7699-d05c-4227-be29-9031af4e0751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-26e4e77c-f5b9-4b34-b649-505e679c7203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26e4e77c-f5b9-4b34-b649-505e679c7203
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-26e4e77c-f5b9-4b34-b649-505e679c7203
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-cab6e9e1-507d-4b19-b6f7-7ab22441a15d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cab6e9e1-507d-4b19-b6f7-7ab22441a15d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cab6e9e1-507d-4b19-b6f7-7ab22441a15d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-c45901e7-f811-490b-a666-5d0275351faf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45901e7-f811-490b-a666-5d0275351faf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c45901e7-f811-490b-a666-5d0275351faf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e6e1ae4-e9a6-49ae-9920-c0fdc5975704

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e6e1ae4-e9a6-49ae-9920-c0fdc5975704
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e6e1ae4-e9a6-49ae-9920-c0fdc5975704
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dde3f72-013f-4cdc-b186-ba6419b3f250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dde3f72-013f-4cdc-b186-ba6419b3f250
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dde3f72-013f-4cdc-b186-ba6419b3f250
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8379f5f-7df5-4a4c-aba2-bb8e00d81d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8379f5f-7df5-4a4c-aba2-bb8e00d81d16
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8379f5f-7df5-4a4c-aba2-bb8e00d81d16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-13bbeacc-309a-4ec4-bcf9-097f2b5c2ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13bbeacc-309a-4ec4-bcf9-097f2b5c2ddc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-13bbeacc-309a-4ec4-bcf9-097f2b5c2ddc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-59b6bd00-52ed-4bc9-900f-45707d7472f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b6bd00-52ed-4bc9-900f-45707d7472f3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-59b6bd00-52ed-4bc9-900f-45707d7472f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-57ab69b8-2bd0-4c6a-b1dd-5c63c8869ec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ab69b8-2bd0-4c6a-b1dd-5c63c8869ec4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57ab69b8-2bd0-4c6a-b1dd-5c63c8869ec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-57ab69b8-2bd0-4c6a-b1dd-5c63c8869ec4"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-52920b06-3bbc-42c5-840a-3ae94c7ffde8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52920b06-3bbc-42c5-840a-3ae94c7ffde8
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52920b06-3bbc-42c5-840a-3ae94c7ffde8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-52920b06-3bbc-42c5-840a-3ae94c7ffde8"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-05e0d43f-2860-437d-9bd5-82b49cbd83ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e0d43f-2860-437d-9bd5-82b49cbd83ea
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05e0d43f-2860-437d-9bd5-82b49cbd83ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-05e0d43f-2860-437d-9bd5-82b49cbd83ea"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e742ce4-5ce5-4220-9efa-e48e4ddfd5c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e742ce4-5ce5-4220-9efa-e48e4ddfd5c6
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e742ce4-5ce5-4220-9efa-e48e4ddfd5c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2e742ce4-5ce5-4220-9efa-e48e4ddfd5c6"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-96621b3d-7251-42c5-996c-9199b1fe4b2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96621b3d-7251-42c5-996c-9199b1fe4b2a
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96621b3d-7251-42c5-996c-9199b1fe4b2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-96621b3d-7251-42c5-996c-9199b1fe4b2a"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-b196c1ab-739d-40d1-86bf-3c9eda2e7508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b196c1ab-739d-40d1-86bf-3c9eda2e7508
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b196c1ab-739d-40d1-86bf-3c9eda2e7508
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b196c1ab-739d-40d1-86bf-3c9eda2e7508"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-a86cd854-911f-4866-a811-7f73fffb4988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a86cd854-911f-4866-a811-7f73fffb4988
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a86cd854-911f-4866-a811-7f73fffb4988
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a86cd854-911f-4866-a811-7f73fffb4988"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-e523dff3-0d5a-4553-b732-fc4bb9eb603a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e523dff3-0d5a-4553-b732-fc4bb9eb603a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e523dff3-0d5a-4553-b732-fc4bb9eb603a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e523dff3-0d5a-4553-b732-fc4bb9eb603a"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5ddd826-c4dc-43eb-b91c-63cb44c37993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ddd826-c4dc-43eb-b91c-63cb44c37993
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5ddd826-c4dc-43eb-b91c-63cb44c37993
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e5ddd826-c4dc-43eb-b91c-63cb44c37993"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-24e4c057-4b98-4d6f-a4d4-b4797cdfc275

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24e4c057-4b98-4d6f-a4d4-b4797cdfc275
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24e4c057-4b98-4d6f-a4d4-b4797cdfc275
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-24e4c057-4b98-4d6f-a4d4-b4797cdfc275"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-1281eef6-7db3-4800-83a9-540ff03090e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1281eef6-7db3-4800-83a9-540ff03090e0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1281eef6-7db3-4800-83a9-540ff03090e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1281eef6-7db3-4800-83a9-540ff03090e0"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b79f832-b816-4a12-8794-7eb4b2f85f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b79f832-b816-4a12-8794-7eb4b2f85f6b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b79f832-b816-4a12-8794-7eb4b2f85f6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4b79f832-b816-4a12-8794-7eb4b2f85f6b"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0b0f32b-bd3a-40c3-a43f-f604cd9f3487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0b0f32b-bd3a-40c3-a43f-f604cd9f3487
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0b0f32b-bd3a-40c3-a43f-f604cd9f3487
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0b0f32b-bd3a-40c3-a43f-f604cd9f3487"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f79b004-60b7-4f16-967d-055398e8f1ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f79b004-60b7-4f16-967d-055398e8f1ae
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f79b004-60b7-4f16-967d-055398e8f1ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8f79b004-60b7-4f16-967d-055398e8f1ae"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-eee59095-886a-4081-8adb-209c8e1af3bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eee59095-886a-4081-8adb-209c8e1af3bd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eee59095-886a-4081-8adb-209c8e1af3bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eee59095-886a-4081-8adb-209c8e1af3bd"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef210254-7c3a-4402-834a-f33ac44b192a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef210254-7c3a-4402-834a-f33ac44b192a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef210254-7c3a-4402-834a-f33ac44b192a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ef210254-7c3a-4402-834a-f33ac44b192a"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-a02b5e63-3845-4dbe-9e9c-f0e5d7e68f07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a02b5e63-3845-4dbe-9e9c-f0e5d7e68f07
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a02b5e63-3845-4dbe-9e9c-f0e5d7e68f07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a02b5e63-3845-4dbe-9e9c-f0e5d7e68f07"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-47c8b97d-5870-4b0e-8033-3e3d8d7eaa47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47c8b97d-5870-4b0e-8033-3e3d8d7eaa47
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47c8b97d-5870-4b0e-8033-3e3d8d7eaa47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-47c8b97d-5870-4b0e-8033-3e3d8d7eaa47"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-c38325c9-f4c0-40fd-b269-865574d54917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c38325c9-f4c0-40fd-b269-865574d54917
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c38325c9-f4c0-40fd-b269-865574d54917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c38325c9-f4c0-40fd-b269-865574d54917"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-815cf7db-76e1-4810-8a63-900dfea76c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-815cf7db-76e1-4810-8a63-900dfea76c2b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-815cf7db-76e1-4810-8a63-900dfea76c2b
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
Content-Length: 181

{"id":"acc_88208311-7e4f-4b69-bf50-ca1ca7a729a0","handle":"qa-2d1697133984","displayName":"QA 2d1697133984","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.225113850Z"}
```

## 83. DELETE /v1/accounts/me

```text
#83 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-983c072e-5070-487e-8655-809cee6c97f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-983c072e-5070-487e-8655-809cee6c97f3
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-983c072e-5070-487e-8655-809cee6c97f3
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

## 84. POST /v1/auth/token

```text
#84 POST http://localhost:7070/v1/auth/token
correlation: qa-37747e2b-a274-47ef-be43-7d94de07bb8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37747e2b-a274-47ef-be43-7d94de07bb8e
Content-Type: application/json

--- request body ---
{"handle":"qa-2d1697133984","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37747e2b-a274-47ef-be43-7d94de07bb8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37747e2b-a274-47ef-be43-7d94de07bb8e"}
```
